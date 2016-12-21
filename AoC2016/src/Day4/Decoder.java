package Day4;

import java.util.Arrays;
import java.util.TreeMap;

class Decoder {
    private String raw;

    Decoder(String raw){
        this.raw = raw;
    }

    void decode(){
        TreeMap<Character, Integer> hmap = new TreeMap<>();
        String[] parts = this.raw.split("-");
        parts = Arrays.copyOf(parts, parts.length-1);
        StringBuilder builder = new StringBuilder();
        for(String s : parts) {
            builder.append(s);
        }
        String n =  builder.toString();
        char[] chars = n.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
//        System.out.println(sorted);

        for(char c: sorted.toCharArray()){
                int count = hmap.containsKey(c) ? hmap.get(c) : 0;
                hmap.put(c, count + 1);
        }

        System.out.println(Arrays.toString(hmap.entrySet().toArray()));
    }
}
