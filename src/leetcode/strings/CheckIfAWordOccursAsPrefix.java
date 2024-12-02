package leetcode.strings;

import java.util.Arrays;

public class CheckIfAWordOccursAsPrefix {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");

        for(int idx = 0; idx < s.length; idx++){
            if(s[idx].startsWith(searchWord))
                return idx + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        CheckIfAWordOccursAsPrefix obj = new CheckIfAWordOccursAsPrefix();
        System.out.println(obj.isPrefixOfWord("i love eating burger", "burg"));
    }
}
