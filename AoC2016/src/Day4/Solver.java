package Day4;

import java.io.*;

public class Solver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("src/Day4/input.txt")));
        String line;
        Decoder d;
        while ((line = br.readLine()) != null){
            d = new Decoder(line);
            d.decode();
        }
    }
}