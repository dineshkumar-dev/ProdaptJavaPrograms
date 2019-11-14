package javaFirstProdapt;
import java.util.Scanner;
public class Runs {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	double FourScore,SixScore,totalScore,noOfFours,noOfSixes,BoundaryScore,RunScore;
	double RunScorePercentage;
	totalScore=s.nextInt();
	 noOfFours=s.nextInt();
	 noOfSixes=s.nextInt();
	 FourScore=4*noOfFours;
	 SixScore=6*noOfSixes;
	 BoundaryScore=FourScore+SixScore;
	 RunScore=totalScore-BoundaryScore;
	 RunScorePercentage=(RunScore*100/totalScore);
	 System.out.println("The run percentage is %.02f"+RunScorePercentage);
}
}
