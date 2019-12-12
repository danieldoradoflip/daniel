import java.util.Scanner;

public class LabExer1B {
	public static void main(String [] args){
	Scanner j = new Scanner(System.in);
	System.out.println("Enter an integer: ");
	int num = j.nextInt();
	showNumberPlus10(num);
	showNumberPlus100(num);
	showNumberPlus1000(num);
	
	}
public static void showNumberPlus10( int num){
	int show = num + 10;
	System.out.println(num + " plus 10 is " + show);
}
public static void showNumberPlus100(int num){
	int show = num + 100;
	System.out.println(num + " plus 100 is " + show);
}	
public static void showNumberPlus1000(int num){
	int show = num + 1000;
	System.out.println(num + " plus 1000 is " + show);
}	
}

