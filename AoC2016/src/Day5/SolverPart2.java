package Day5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by felipeluna on 21/12/16.
 * AoC Day 5 Part 2
 */
public class SolverPart2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        boolean condition = true;
        int counter = 0;
        int condCounter = 0;
        StringBuilder ss = new StringBuilder();
        char [] part2 = {'_','_','_','_','_','_','_','_'};
        while(condition){
            String input = "cxdnnyjw" + counter;
            md.update(input.getBytes());
            byte[] hash = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte aHash : hash) {
                sb.append(Integer.toString((aHash & 0xff) + 0x100, 16).substring(1));
            }
            String res = sb.toString();
            if(res.startsWith("00000")) {
                char six = res.charAt(5);
                if(Character.isDigit(six)){
                    int intsix = Character.getNumericValue(six);
                    if(intsix < 8){
                        System.out.println(res.substring(5, 7));
                        if(part2[intsix] == '_'){
                            condCounter++;
                            part2[intsix] = res.charAt(6);
                        }
                    }
                }
            }
            counter++;
            if(condCounter > 7){
                condition = false;
            }
        }
        for(char c : part2){
           ss.append(c);
        }
        System.out.println(ss.toString());


    }
}
