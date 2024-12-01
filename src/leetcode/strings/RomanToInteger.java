package leetcode.strings;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> symbol = new HashMap<>();
        symbol.put('I', 1);
        symbol.put('V', 5);
        symbol.put('X', 10);
        symbol.put('L', 50);
        symbol.put('C', 100);
        symbol.put('D', 500);
        symbol.put('M', 1000);

        int sum =0;
        for (int i = 0; i < s.length() - 1; i++ ) {
           if(symbol.get(s.charAt(i)) < symbol.get(s.charAt(i + 1)))
               sum -= symbol.get(s.charAt(i));
           else
               sum += symbol.get(s.charAt(i));
        }

        return sum + symbol.get(s.charAt(s.length()-1));
    }

    public static void main(String[] args) {
        RomanToInteger r = new RomanToInteger();
        System.out.println(r.romanToInt("MCMXCIV"));
    }
}
