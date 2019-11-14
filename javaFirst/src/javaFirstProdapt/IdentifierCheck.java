package javaFirstProdapt;
import java.util.Scanner;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class IdentifierCheck {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String variName=s.nextLine();
		Pattern p=Pattern.compile("!@#$%^&*()_+~`");
		Matcher m=p.matcher(variName);
		if(m.matches()) {
			System.out.println("Error 2");
		}
	}
}
