
public class b6 {
	public static int  findIndex (int[] my_arr, int t) {
        if (my_arr == null) return -1;
        int len = my_arr.length;
        int i = 0;
        while (i < len) {
            if (my_arr[i] == t) return i;
            else i=i+1;
        }
        return -1;
	}
	public static void main(String[] args) {
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	      System.out.println("Vị trí số 25 là: " + findIndex(my_array, 25));
	      System.out.println("Vị trí số 77 là: " + findIndex(my_array, 77));
	      
	}

}
