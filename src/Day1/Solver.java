package Day1;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class Solver {
    public static void main(String[] args) throws IOException {
        int initialX = 0;
        int initialY = 0;
        int initialDirection = 0;
        Walker paul = new Walker(initialDirection,initialX,initialY);

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("src/Day1/input.txt")));
            String[] instructions = br.readLine().split(", ");
            br.close();
            for(String instruction : instructions){

                paul.changeDirection(instruction.charAt(0));
                for (int i = 0; i < Integer.parseInt(instruction.substring(1)); i++) {
                    paul.walk();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        paul.countFromStart();

    }
}
