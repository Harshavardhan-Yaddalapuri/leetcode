import java.util.Arrays;

public class MissingNumber {

    int missingNumber(int arr[]) {
        // code here
        int n = arr.length;
        int i;
        Arrays.sort(arr);
        for(i = 1; i <= n; i++){
            if(arr[i-1] != i){
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(new MissingNumber().missingNumber(new int[]{1, 2, 3, 5}));
    }
}
