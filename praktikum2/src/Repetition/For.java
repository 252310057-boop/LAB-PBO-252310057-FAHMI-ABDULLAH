package Repetition;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		
	
		Scanner input =new Scanner(System.in);
		
		System.out.println("Masukan jumlah pengulangan");
		int number=input.nextInt();
		
//        for(int i=0;i<number;i++) {
//        	System.out.println("hello wordl");
//        }
//        
        int a=0;
        while(a<number) {
        	System.out.println("hello wordl");
        	a++;
        }
        int b=0;
        do {
        	System.out.println("hello wordl");
        	b++;
        }while(b<number);
	}
}