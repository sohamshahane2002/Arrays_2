package ARRAYS;

public class MoveZeroes {
    
    public static void movezeroes(int arr[]){
        int j = 0;
        for (int i = 0 ; i < arr.length ;i++){
            if(arr[i] != 0){
                if(i != 0){
                    arr[j]=arr[i];
                    arr[i]=0;
                }
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int numbers[]={0, 1, 0, 3, 12};
        
        
        System.out.print("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        movezeroes(numbers);
        
        System.out.print("Array after moving zeroes: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
  
    }
}
