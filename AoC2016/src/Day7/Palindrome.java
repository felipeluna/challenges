package Day7;

/**
 * Created by felipeluna on 22/12/16.
 * Aoc 2016 Day 7
 */
class Palindrome {
    private String code;

    Palindrome(String code){
        this.code = code;
    }

    boolean isPalindrome(){
        String[] strs = this.code.split("[|]");
        for (String s : strs){
            System.out.println(s);
        }
        return false;
    }
}
