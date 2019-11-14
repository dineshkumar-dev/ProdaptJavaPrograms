package javaFirstProdapt;
import java.util.Scanner;
public class Operations {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int number1=s.nextInt();
	int number2=s.nextInt();
	int number3=s.nextInt();
	if((number3==number1+number2)||(number3==number1*number2)) {
		System.out.println("multiplication and Addition ");
	}
	else if(number3==number1-number2) {
		System.out.println("subtraction");
	}
	else if(number3==number1*number2) {
		System.out.println("multiplication");
	}
	else if(number3==number1/number2) {
		System.out.println("division");
	}
	else  if (number3==number1+number2){
		System.out.println("Addition ");
	}
	else  if ((number3!=number1+number2)||(number3!=number1-number2)||(number3!=number1*number2)||(number3!=number1/number2)){
		System.out.println("not possible");
	}
}}
