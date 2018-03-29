
public class b4 {

	public static void main(String[] args) {
		int[] numbers = new int[]{20, 30, 25, 35, -50, 60, -100};
	       int sum = 0;
	       for(int i=0; i < numbers.length ; i++)
	        sum = sum + numbers[i];
	        double tb= sum / numbers.length;
	        System.out.println("Giá trị trung bình của mảng là: " +tb); 

	}

}
