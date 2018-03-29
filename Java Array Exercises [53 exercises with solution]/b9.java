import java.util.Arrays;

public class b9 {

	public static void main(String[] args) {
		 int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};   
		   int vitri = 2;
		   int sochen = 5;

		  System.out.println("Mảng trước : "+Arrays.toString(my_array));     
		   
		  for(int i=my_array.length-1; i > vitri; i--){
		    my_array[i] = my_array[i-1];
		   }
		   my_array[vitri] = sochen;
		   System.out.println("Mảng mới: "+Arrays.toString(my_array));
		 }	 
}


