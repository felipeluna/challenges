package Day5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by felipeluna on 21/12/16.
 * AoC Day 5 Part 1
 */
public class SolverPart1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        boolean condition = true;
        int counter = 0;
        int condCounter = 0;
        StringBuilder ss = new StringBuilder();
        while(condition){
            String input = "cxdnnyjw" + counter;
            md.update(input.getBytes());
            byte[] hash = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte aHash : hash) {
                sb.append(Integer.toString((aHash & 0xff) + 0x100, 16).substring(1));
            }
            String res = sb.toString();
            if(res.startsWith("00000")){
                ss.append(res.charAt(5));
                System.out.println(res + " " + counter);
                condCounter++;
                if(condCounter == 8){
                    condition = false;
                }
            }
            counter++;
        }
        System.out.println(ss.toString());

    }
}
