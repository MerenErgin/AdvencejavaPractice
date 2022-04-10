package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter02 {

    public static void main(String[] args) {
        /*
        TASK :
         Kullanicidan bir character girmesini isteyiniz
         Character harf ise kucuk harf olup olmadigini kontrol ediniz
         Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
         Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
         Harf degilse ekrana "Harf degil" yazdiriniz
         97:a  122:z ascii değeri
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karaker giriniz");

        char karakter = scan.next().charAt(0);

        String sonuc="";

        sonuc= karakter>= 'a' && karakter<='z' || karakter>= 'A' && karakter<='Z' ?
                (karakter>= 'a' && karakter<='z'? "Kucuk Harf": "Buyuk Harf"): "Harf degil";

        System.out.println(sonuc);


/*

        if (karakter>='A' && karakter<='Z' && karakter>='a' && karakter<='z'){
            if (karakter>='a'){
                System.out.println("Kucuk Harf");
            }else{
                System.out.println("Buyuk Harf");
            }
        }else{
            System.out.println("Harf degil");
        }
*/

    }
}
