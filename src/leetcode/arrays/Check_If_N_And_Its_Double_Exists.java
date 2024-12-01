package leetcode.arrays;

import java.util.HashSet;

public class Check_If_N_And_Its_Double_Exists {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> s = new HashSet<>();

        for (int j : arr) {
            if (s.contains(j * 2) || j % 2 == 0 && s.contains(j / 2)) {
                return true;
            }
            s.add(j);
        }

        return false;
    }

    public static void main(String[] args) {
        Check_If_N_And_Its_Double_Exists c = new Check_If_N_And_Its_Double_Exists();
        System.out.println(c.checkIfExist(new int[]{-2,0,10,-19,4,6,-8}));
    }
}
