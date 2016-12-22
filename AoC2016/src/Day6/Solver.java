package Day6;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by felipeluna on 22/12/16.
 * AoC 2016 day 6
 */
public class Solver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("src/Day6/input.txt")));
        String line;

        List<HashMap<Character, Integer>> group = new ArrayList<>(8);
        for (int i = 0; i < 8; i++) {
            group.add(new HashMap<>());
        }
        while ((line = br.readLine()) != null){
            char [] row = line.toCharArray();
            for (int i = 0; i < row.length; i++) {
                int times;
                if(group.get(i).containsKey(row[i])){
                    times = group.get(i).get(row[i]);
                }else{
                    times = 0;
                }

                group.get(i).put(row[i], times+1);
            }
        }
        for (HashMap<Character, Integer> hmap : group){
            System.out.println(hmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()));
        }
    }
}
