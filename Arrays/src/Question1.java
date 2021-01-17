import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		System.out.println("Please enter first number");
		numbers[0]= sc.nextInt();
		System.out.println("Please enter Second number");
		numbers[1]= sc.nextInt();
		System.out.println("Please enter Third number");
		numbers[2]= sc.nextInt();
		System.out.println("Please enter Fourth number");
		numbers[3]= sc.nextInt();
		System.out.println("Please enter Fifth number");
		numbers[4]= sc.nextInt();
		System.out.println(Arrays.toString(numbers)); // validate array saved 
		 
		int sum = 0;
		sum = numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
		System.out.println("Total = " + sum);
		
		
	}
}
