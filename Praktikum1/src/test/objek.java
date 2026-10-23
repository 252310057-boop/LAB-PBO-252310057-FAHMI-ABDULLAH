package test;

import java.util.Scanner;

public class objek {
	
	public static void main(String[] args) {
		int panjang, lebar, hasil;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukan Panjang");
		panjang = scanner.nextInt();
		System.out.print("Masukan Lebar");
		lebar = scanner.nextInt();
		hasil = panjang * lebar;
		System.out.print("hasil = "+ hasil);
	}

}
