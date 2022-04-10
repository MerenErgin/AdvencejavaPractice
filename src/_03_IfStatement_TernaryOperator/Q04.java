package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen IT alanında bilginizi giriniz (qa, dev, ba, pm): ");
		String meslek= scan.next().toLowerCase();

			switch (meslek) {
				case "qa":
					System.out.println("Quality Analyst");
					break;
				case "dev":
					System.out.println("Developer");
					break;
				case "ba":
					System.out.println("Busines Analyst");
					break;
				case "pm":
					System.out.println("Project Manager");
					break;
				default:
					System.out.println("Hatalı giriş lütfen tekrar deneyiniz");
			}



	}

}
