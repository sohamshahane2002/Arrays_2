package ARRAYS;
public class MeanMedian {
    public static int mean(int arr[]){
        int sum =0;
        int mean=0;
        for(int i : arr){
            sum = sum+i;     
        }
        return  sum/arr.length;
    }
    public static double findMedian(int[] arr) {
        
        int mid = arr.length / 2;
        // Handle even-sized array
        if (arr.length % 2 == 0) {
          return (double) (arr[mid - 1] + arr[mid]) / 2.0;
        } else { // Handle odd-sized array
          return arr[mid];
        }
      }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,9};
        int finalmean = mean(nums);
        System.out.println();
        System.out.println("===============MEAN==============");
        System.out.println("Mean of the elements in array is : "+finalmean);
        System.out.println("===============MEDIAN==============");
        
        int[] oddArray = {1, 3, 4, 2, 7, 5, 9};
        int[] evenArray = {2, 3, 4, 5, 6, 7};
        double evenMedian = findMedian(evenArray);
        double oddMedian = findMedian(oddArray); 
        System.out.println("Median of even-sized array: " + evenMedian);
        System.out.println("Median of odd-sized array: " + oddMedian);
        System.out.println("====================================");

    }
}
