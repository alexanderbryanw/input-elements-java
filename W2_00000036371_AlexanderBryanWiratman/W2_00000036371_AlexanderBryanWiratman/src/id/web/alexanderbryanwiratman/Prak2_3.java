package id.web.alexanderbryanwiratman;
import java.util.Scanner;


public class Prak2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Berat Badan Ideal\n");
		Scanner scan = new Scanner(System.in);
		System.out.print("Tinggi Badan = ");
		double tinggi = scan.nextDouble();
		tinggi  = tinggi*100;
		double ideal = tinggi - 100 - (0.1*(tinggi-100));
		System.out.println("Berat Badan Ideal = " + ideal + "kg");	
	}

}
