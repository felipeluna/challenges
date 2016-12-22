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
        Matcher m = Pattern.compile("(?!\\[(.*?)\\])").matcher(input);
        while(m.find()){
            System.out.println(m.group(1));
        }

//        for(String s : "abba[mnop]qrst".split("\\[(.*[^]])\\]")){
//            System.out.println(s);
//        }

//        Palindrome pal = new Palindrome("abba[mnop]qrst");
//        pal.isPalindrome();
//        while((line = br.readLine()) != null){
//
//        }
    }
}
