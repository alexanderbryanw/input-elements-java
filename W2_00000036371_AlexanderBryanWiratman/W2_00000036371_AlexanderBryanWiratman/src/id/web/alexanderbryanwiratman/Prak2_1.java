package id.web.alexanderbryanwiratman;
import java.util.Scanner; 

public class Prak2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Tahun masuk: ");
		int TahunMasuk = scan.nextInt();
		System.out.print("Jumlah sks: ");
		int sks = scan.nextInt();
		int biayasemester = 0, biayasks = 0;
		if (TahunMasuk >= 2011 && TahunMasuk < 2016){
			if(TahunMasuk == 2011){
				biayasemester = 3300000;
				biayasks = 250000;	
			}else if (TahunMasuk == 2012){
				biayasemester = 3450000;
				biayasks = 300000;
			}else if (TahunMasuk == 2013){
				biayasemester = 3600000;
				biayasks = 350000;
			}else if (TahunMasuk == 2014){
				biayasemester = 3750000;
				biayasks = 400000;
			}else {
				biayasemester = 3900000;
				biayasks = 450000;
			}
			int biayakrs = biayasemester + (biayasks*sks);
			System.out.printf("Biaya krs anda adalah: %d",biayakrs);
		}else{
			System.out.print("Tahun masuk tidak valid! ");
		}
	}
}
