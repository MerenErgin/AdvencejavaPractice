package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*
		  TASK :
		  Kullanici tarafindan girilen bir sayinin
		  mutlak degerini yazdiran code create ediniz.
		 */

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi girin");
		int sayi=scan.nextInt();
		int mutlak=0;

		if (sayi>=0){
			mutlak=sayi;
			System.out.println("girdiginiz sayinin mutlak degeri: "+mutlak);
		}else if(sayi<0){
			mutlak= sayi*-1;
			System.out.println("girdiginiz sayinin mutlak degeri: "+mutlak);
		}else{
			System.out.println("lütfen gecerli bir tamsayi yazin");
		}


		
		
		
	}

}
