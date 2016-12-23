package Day7;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by felipeluna on 22/12/16.
 * AoC 2016 Day 7
 */
public class Solver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("src/Day7/input.txt")));
        String line;
        String input = "abba[mnop]qrst";
        Matcher m = Pattern.compile("\\[[^\\]]*\\]|(\\b\\w+\\b)").matcher(input);
        int counter = 0;
        while(m.find()){
            if(m.group().startsWith("[")){
                String middle = m.group().substring(1, m.group().length()-1);
                 // if middle is palindrome
                char[] middleChar = middle.toCharArray();
                for (int i = 0; i < middleChar.length/2; i++) {
                    if(middleChar[i] != middleChar[middleChar.length - 1 - i]){
                        break;
                    }
                }
            }else{
                String middle = m.group().substring(1, m.group().length()-1);
                // if middle is palindrome
                char[] middleChar = middle.toCharArray();
                for (int i = 0; i < middleChar.length/2; i++) {
                    if(middleChar[i] != middleChar[middleChar.length - 1 - i]){
                        counter++;
                        break;
                    }
                }
            }
        }
    }
}
