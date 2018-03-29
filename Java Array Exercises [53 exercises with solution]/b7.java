import java.util.Arrays;

public class b7 {

	public static void main(String[] args) {
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		   
		   System.out.println("Original Array : "+Arrays.toString(my_array));     
		   
		 
		   int removeIndex = 1;

		   for(int i = removeIndex; i < my_array.length -1; i++){
		        my_array[i] = my_array[i + 1];
		      }
		    System.out.println("Mảng sau khi loại bỏ phần tửs: "+Arrays.toString(my_array));
		 }

	
}
