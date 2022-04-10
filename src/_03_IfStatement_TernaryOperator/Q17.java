package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TASK:
		// Kullanıcının girdiği yılın artık yıl olup olmadığını kontrol eden code create ediniz.
		//kural 1: 4 ile bolunemeyen yillar artik yil degildir
		//kural 2: 4'un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400'un kati olanlar artik yildir
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir yil yaziniz");
		int yil= scan.nextInt();

		if (yil%100==0){
			if (yil%400==0){
				System.out.println(yil+" yili bir artik yildir");
			}else {
				System.out.println(yil+" yili artik yil degildir");
			}
		}else{
			if (yil%4==0){
				System.out.println(yil+" yili bir artik yildir");
			}
			else
				System.out.println(yil+" yili artik yil degildir");
		}


	}

}
