package id.web.alexanderbryanwiratman;
import java.util.Scanner;

public class Prak2_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Panjang: ");
		int panjang = scan.nextInt();
		panjang = panjang*100;
		System.out.print("Lebar: ");
		int lebar = scan.nextInt();
		lebar = lebar*100;
		System.out.print("Tinggi: ");
		int tinggi = scan.nextInt();
		tinggi = tinggi*100;
		int volume = panjang * lebar * tinggi;
		if(volume <= 100){
			System.out.printf("Volume balok: %d cm3\n",volume);
			System.out.print("Balok ini masuk kategori kecil");
		} else if (volume>100 && volume<=250){
			System.out.printf("Volume balok: %d cm3\n",volume);
			System.out.print("Balok ini masuk kategori sedang");
		} else {
			System.out.printf("Volume balok: %d cm3\n",volume);
			System.out.print("Balok ini masuk kategori besar");
		}
	}
	
}
		
