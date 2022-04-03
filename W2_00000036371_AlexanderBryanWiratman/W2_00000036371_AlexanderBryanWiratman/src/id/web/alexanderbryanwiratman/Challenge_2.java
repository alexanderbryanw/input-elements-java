package id.web.alexanderbryanwiratman;
import java.util.Scanner;
public class Challenge_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nama			: ");
		String nama = scan.nextLine();
		System.out.print("Semester		: ");
		int semester = scan.nextInt();
		System.out.println("====MASUKKAN DETAIL BIAYA====");
		System.out.print("Biaya Konsumsi/hari		: ");
		int konsumsi = scan.nextInt();
		System.out.print("Biaya Transportasi/hari		: ");
		int transportasi = scan.nextInt();
		System.out.print("Biaya Komunikasi/bulan		: ");
		int komunikasi = scan.nextInt();
		System.out.print("Biaya Akomodasi/bulan		: ");
		int akomodasi = scan.nextInt();
		System.out.print("Biaya Kuliah/semester		: ");
		int kuliah = scan.nextInt();
		System.out.print("Biaya Buku Pelajaran/semester	: ");
		int buku = scan.nextInt();
		int total = (konsumsi*semester*180)+(transportasi*semester*180)+(komunikasi*semester*6)+(kuliah*semester)+(buku*semester);
		System.out.printf("Halo, %s. Kamu sudah kuliah selama %d semester. \n"
				+ "Biaya yang sudah kamu keluarkan sebesar %d ", nama, semester, total);
	}

}
