package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir islem seciniz:");
		System.out.println(" (Toplama icin 1\n Cıkarma icin 2\n Bolme icin 3\n Carpma icin 4) ");
		// Kullaniciya secim icin  islem menusu sunduk
		int islem = scan.nextInt();

		System.out.println("Lutfen iki tamsayi giriniz");

		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();

		if (islem==1){
			System.out.println("Toplama isleminin sonucu : "+num1+" + "+ num2+" = "+(num1+num2));
		}else if (islem==2){
			System.out.println("Cıkarma isleminin sonucu : "+num1+" - "+ num2+" = "+(num1-num2));
		}else if (islem==3){
			System.out.println("Bolme isleminin sonucu : "+num1+" / "+ num2+" = "+(num1/num2));
		}else if (islem==4){
			System.out.println("Carpma isleminin sonucu : "+num1+" * "+ num2+" = "+(num1*num2));
		}else {
			System.out.println("Hatali islem yaptiniz");
		}

	}

}
