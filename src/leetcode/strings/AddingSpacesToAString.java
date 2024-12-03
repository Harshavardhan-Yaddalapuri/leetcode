package leetcode.strings;

public class AddingSpacesToAString {
    public String addSpaces(String s, int[] spaces) {

        StringBuilder ans = new StringBuilder();
        int k = 0, i = 0;
        while(i < s.length()){
            if(k < spaces.length && i == spaces[k]){
                ans.append(" ");
                k++;

            }else{
                ans.append(s.charAt(i));
                i++;
            }
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        AddingSpacesToAString obj = new AddingSpacesToAString();
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8,13,15};
        System.out.println(obj.addSpaces(s, spaces));
    }

}
