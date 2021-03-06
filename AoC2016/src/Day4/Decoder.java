package Day4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Decoder {
    private String raw;

    Decoder(String raw) {
        this.raw = raw;
    }

    int decode() {
        HashMap<Character, Integer> hmap = new HashMap<>();
        String[] parts = this.raw.split("-");
        String left = parts[parts.length - 1];
        String[] vals = left.split("\\[");
        int checksum = Integer.parseInt(vals[0]);
        String code = vals[1].split("\\]")[0];
        parts = Arrays.copyOf(parts, parts.length - 1);


        StringBuilder builder = new StringBuilder();
        for (String s : parts) {
            builder.append(s);
        }
        String n = builder.toString();
        char[] chars = n.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

        for (char c : sorted.toCharArray()) {
            int count = hmap.containsKey(c) ? hmap.get(c) : 0;
            hmap.put(c, count + 1);
        }
        System.out.println(hmap.entrySet());
        // from https://github.com/chasehaddleton/AdventofCode-2016/blob/master/src/com/chasehaddleton/adventofcode/y2016/dayFour.java
        List<Character> keys = hmap.entrySet()
                .stream()
                .sorted((o1, o2) -> { // sort based off highest value first, then alphabetically by key
                    if (o1.getValue() < o2.getValue()) return 1;
                    if (o1.getValue() > o2.getValue()) return -1;
                    if (o1.getKey() < o2.getKey()) return -1;
                    if (o1.getKey() > o2.getKey()) return 1;
                    return 0;

                })
                .map(Map.Entry::getKey) // get each key
                // since the keys are the right order for the checksum, we can just grab as many as we need
                .collect(Collectors.toList()).subList(0, 5); //hardcoded 5, change that

        StringBuilder sb = new StringBuilder();
        for (char c : keys) {
//            System.out.println(c);
            sb.append(c);
        }
        String keyValue = sb.toString();
        if (code.equals(keyValue)) {
            return checksum;
        }else{
            return 0;
        }
    }
    int north(){
        HashMap<Character, Integer> hmap = new HashMap<>();
        String[] parts = this.raw.split("\\[");
        String msg = parts[0].substring(0, parts[0].length()-4);
        int code = Integer.parseInt(parts[0].substring(parts[0].length()-3, parts[0].length()));
        StringBuilder sb = new StringBuilder();
        for(char c : msg.toCharArray()){
            if(c != '-'){
                char n = (char) ((c + code - (int)'a') % 26 + (int)'a');
                sb.append(n);
            }else{
                sb.append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);
        if(result.contains("north")){
            return code;
        }else{
            return 0;
        }

    }
}

