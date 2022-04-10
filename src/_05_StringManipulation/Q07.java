package _05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen uc harfli bir kelime dirin: ");
        String kelime=scan.next();

        char c1=kelime.charAt(0);
        char c2=kelime.charAt(1);
        char c3=kelime.charAt(2);

        String sonuc= kelime.length()==3 ?((c1!=c2 && c1!=c3 && c2!=c3)? "Girdiginiz kelime 3 harfli ve uniq karaktere sahip":
                "Girdiginiz kelime 3 harfli ama uniq karaktere sahip değil ") : "Girdiginiz kelime 3 harfli degil" ;

        System.out.println(sonuc);

    }
}