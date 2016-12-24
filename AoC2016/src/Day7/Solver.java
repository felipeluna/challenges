package Day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by felipeluna on 22/12/16.
 * AoC 2016 Day 7
 */
public class Solver {


    private static boolean isTsl(String s){
        Pattern p = Pattern.compile("(.)((?!\\1).)\\2\\1");
        Matcher m = p.matcher(s);

        while(m.find()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("src/Day7/input.txt")));
        String line;
        int generalCounter = 0;

        while ((line = br.readLine()) != null) {
            int noBrackets = 0;
            int brackets = 0;
            Matcher m = Pattern.compile("\\[[^\\]]*\\]|(\\b\\w+\\b)").matcher(line);
            while (m.find()) {
                if (m.group().startsWith("[")) {
                    String middle = m.group().substring(1, m.group().length() - 1);
                    // if middle is palindrome
                    if (isTsl(middle)) {
                        brackets++;
                        break;
                    }

                } else {
                    String middle = m.group();
                    if (isTsl(middle)) {
                        noBrackets++;
                    }

                }
            }
            if (brackets == 0) {
                if (noBrackets > 0) {
                    generalCounter++;
                }
            }
        }
        System.out.println(generalCounter);
    }
}
