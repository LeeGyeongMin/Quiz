import java.util.Scanner;

public class MyCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		showMenu();
		System.out.print("Select one of the option numbers from above : ");
		num = scan.nextInt();
		switch(num){
		case 1 : addNumbers(getFirstNumbers(), getSecondNumbers()); break;
		case 2 : subNumbers(getFirstNumbers(), getSecondNumbers()); break;
		case 3 : multNumbers(getFirstNumbers(), getSecondNumbers()); break;
		case 4 : divNumbers(getFirstNumbers(), getSecondNumbers()); break;
		case 5 : break;
		default : System.out.println("해당되는 문자가 없습니다."); break;
		}
	}

	public static void showMenu() {
		System.out.println("*Calculator Options Menu");
		System.out.println("1.   Add two integers");
		System.out.println("2.   Subract an integer from an integer");
		System.out.println("3.   Multiply two integers");
		System.out.println("4.   Divide an integer into an integer");
		System.out.println("5.   Exit");
	}
	
	public static void getNumbers(){
		getFirstNumbers();
		getSecondNumbers();
	}
	
	public static double getFirstNumbers(){
		Scanner scan = new Scanner(System.in);
		double num1;

		System.out.print("첫번째 정수를 입력하세요 : ");
		num1 = scan.nextDouble();
		if (checkIfDigit(num1) == 1) {
			return num1;
		} else {
			return convertNumbers((int)num1);
		}
	}

	public static double getSecondNumbers() {
		Scanner scan = new Scanner(System.in);
		double num2;

		System.out.print("두번째 정수를 입력하세요 : ");
		num2 = scan.nextDouble();
		if (checkIfDigit(num2) == 1) {
			return num2;
		} else {
			return convertNumbers((int)num2);
		}
	}

	public static int checkIfDigit(double n) {
		if (n < '0' || n > '9') {
			return 1;
		} else {
			return 0;
		}
	}

	public static int convertNumbers(int n) {
		return n;
	}
	
	public static void addNumbers(double a, double b){
		System.out.println(a +" + " + b + " = " + (a + b));
	}
	
	public static void subNumbers(double a, double b){
		System.out.println(a +" - " + b + " = " + (a - b));
	}
	
	public static void multNumbers(double a, double b){
		System.out.println(a +" * " + b + " = " + (a * b));
	}
	
	public static void divNumbers(double a, double b){
		System.out.println(a +" / " + b + " = " + (a / b));
	}
}
