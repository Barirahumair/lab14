package minmaxlab10;

public class MINMAX {
	 public int getMax(int[] arr) {
		    int max = arr[0];
		    for (int i = 1; i < arr.length; i++) {
		        if (arr[i] > max) {
		            max = arr[i];
		        }}
		    return max;
		    }
		
		public int getMin(int[] arr) {
		    int min = arr[0];
		    for (int i = 1; i < arr.length; i++) {
		        if (arr[i] < min) {
		            min = arr[i];
		        }}
		    return min;
		    }

		public static void main(String[] args) {
			MINMAX obj = new MINMAX();
		    int[] arr = {3, 5, 2, 1, 9, 4};
		    //test case for getMax
		    int max = obj.getMax(arr);
		    System.out.println("Max element in the array is : " + max);
		    
		    //test case for getMin
		    int min = obj.getMin(arr);
		    System.out.println("Min element in the array is : " + min);
		}
}
