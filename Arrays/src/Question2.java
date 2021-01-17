import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Question2 {

	public static void print_array(String[] arr){
		
		System.out.println("User data " + Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		
       String[] arr = new String[6];
		
		Scanner sc = new Scanner(System.in);
		String Input_name= JOptionPane.showInputDialog ("Please Enter your name");
		arr[0]= Input_name; 
		String Input_age = JOptionPane.showInputDialog ("Please Enter your age");
		arr[1]= Input_age;
		String Input_Mobile = JOptionPane.showInputDialog ("Please Enter your Mobile number");
		arr[2]= Input_Mobile;
		String Input_Email = JOptionPane.showInputDialog ("Please Enter your Email");
		arr[3]= Input_Email;
		String Input_Faculty= JOptionPane.showInputDialog ("Please Enter your Faculty");
		arr[4]= Input_Faculty;
		String Input_Department= JOptionPane.showInputDialog ("Please Enter your department");
		arr[5] = Input_Department;
	//	System.out.println(Arrays.toString(arr)); // validate array saved 
		print_array(arr);
		
	}
}
