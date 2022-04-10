package _09_Arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
			isAnagram("listen", "Silent") ==> true
		 */

		Scanner scan= new Scanner(System.in);

		System.out.println("Lutfen anagram icin 1. kelimeyi giriniz");
		String kelime1= scan.nextLine().toLowerCase().replace(" ","");

		System.out.println("Lutfen anagram icin 2. kelimeyi giriniz");
		String kelime2= scan.nextLine().toLowerCase().replace(" ","");

		char[] arr1=kelime1.toCharArray();
		char[] arr2=kelime2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);



	}

}
