package ARRAYS;

public class SumElements{
    public static int Sumelements(int arr[]) {
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum+i;
            
        }
        return sum;

    }
    public static void main(String []args){
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Sum of the elements in the array is : " + Sumelements(arr));
    }
}