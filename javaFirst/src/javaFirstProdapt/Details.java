package javaFirstProdapt;
import java.util.Scanner;
public class Details {
	public static void main(String[] args) {
		PersonalDetails pd = new PersonalDetails(); 
		ProfessionalDetails prod = new ProfessionalDetails();
		/*System.out.println(pd.age);
		System.out.println(pd.name);
		System.out.println(prod.company);
		System.out.println(prod.role);
		//System.out.println(*/
		Scanner s= new Scanner(System.in);
		int player1=s.nextInt();
		int player2=s.nextInt();
		int finalScore;
		if ((player1<0||player1>6)&&(player2<0||player2>6)){
		System.out.println("Please enter the valid input");
		}
		if(player1+player2>8){
			finalScore= (2*(player1+player2)-8);
			System.out.println("The final score " +"  "+finalScore);
		}
		else {
			finalScore=8-(player1+player2);
		System.out.println("the final score" + finalScore);
		}

}
}
