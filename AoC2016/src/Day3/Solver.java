package Day3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("src/Day3/input.txt")));
        ArrayList<Integer> c1 = new ArrayList<>();
        ArrayList<Integer> c2 = new ArrayList<>();
        ArrayList<Integer> c3 = new ArrayList<>();
        String line;
        int counter = 0;
        while((line = br.readLine()) != null){
            Scanner in = new Scanner(line);
            int s1 = in.nextInt();
            int s2 = in.nextInt();
            int s3 = in.nextInt();
            c1.add(s1);
            c2.add(s2);
            c3.add(s3);
            boolean a = (s1 + s2) > s3;
            boolean b = (s2 + s3) > s1;
            boolean c = (s1 + s3) > s2;
            if(a && b && c){
                counter++;
            }
        }
        // Part 1
        System.out.println("Horizontal: " + counter);

        // Part 2
        counter = 0;
        while (!c1.isEmpty()){
            int a1 = c1.remove(0);
            int a2 = c1.remove(0);
            int a3 = c1.remove(0);
            boolean a = (a1 + a2) > a3;
            boolean b = (a2 + a3) > a1;
            boolean c = (a1 + a3) > a2;
            if(a && b && c){
                counter++;
            }
            int b1 = c2.remove(0);
            int b2 = c2.remove(0);
            int b3 = c2.remove(0);
            boolean ba = (b1 + b2) > b3;
            boolean bb = (b2 + b3) > b1;
            boolean bc = (b1 + b3) > b2;
            if(ba && bb && bc){
                counter++;
            }
            int d1 = c3.remove(0);
            int d2 = c3.remove(0);
            int d3 = c3.remove(0);
            boolean da = (d1 + d2) > d3;
            boolean db = (d2 + d3) > d1;
            boolean dc = (d1 + d3) > d2;
            if(da && db && dc){
                counter++;
            }
        }
        System.out.println("Vertical: " + counter);
    }

}
