package Day2;

import java.io.*;

/**
 * Created by felipeluna on 20/12/16.
 */
public class Solver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("src/Day2/input.txt")));

        Keypad keypad = new Keypad(5);

        String line;

        char ch [][] = {
                {'0', '0', '1', '0', '0'},
                {'0', '2', '3', '4', '0'},
                {'5', '6', '7', '8', '9'},
                {'0', 'A', 'B', 'C', '0'},
                {'0', '0', 'D', '0', '0'}
            };
        WeirdKeypad wkpad = new WeirdKeypad(ch);
        while ((line = br.readLine()) != null){
            char c[] = line.toCharArray();
            for (char cmd : c){
                keypad.move(cmd);
                wkpad.move(cmd);
            }
            //comment to toggle between answer 1 and 2;
            //Part 1
            //System.out.print(keypad.value);
            //Part2
            wkpad.printValue();
        }

    }
}
