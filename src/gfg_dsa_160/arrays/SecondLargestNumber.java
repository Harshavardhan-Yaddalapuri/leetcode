package gfg_dsa_160.arrays;

public class SecondLargestNumber {

    public int getSecondLargest(int[] arr) {
        // Code Here

        int largest = -1;
        int second = -1;

        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                second = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > second){
                second = arr[i];
            }


        }
        return second;
    }

    public static void main(String[] args) {
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        int[] arr = {20769, 19913, 16575};
        System.out.println(secondLargestNumber.getSecondLargest(arr)); // Should return 4
    }
}
