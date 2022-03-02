package labs;

import java.util.Scanner;
import java.lang.Math;
public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner joeMamma = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int joe = joeMamma.nextInt();
		
		System.out.println("Enter a positive integer");
		int mama = joeMamma.nextInt();
		
		double soUgly = (int) Math.pow(joe,mama);
		System.out.println(soUgly);
	}
	
	
	
	
	public static void problem02() {
		
		Scanner square = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int joe =square.nextInt();
		double yourMom = Math.sqrt(joe);
		
		System.out.println("The square root of " + joe +"is" + yourMom);
		
	}

	
	

	public static void problem03() {
		Scanner whiteBeard = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int died =whiteBeard.nextInt();
		
		System.out.println("LboZo");
		int inMarineford = whiteBeard.nextInt();

		double so = died*died;
		double does = inMarineford*inMarineford;
		
		double ace = so + does;
		double lBozo = Math.sqrt(ace);
	}


	
	
	public static void problem04() {
		
		
		
	}
	
	
	
	
	
	
}
