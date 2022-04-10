package _08_While_DoWhile;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
         /* TASK :
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)

        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365

        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10
      */

        int nSayi=5;
        int rSayi=3;

        int fark=nSayi-rSayi;

        long nFaktoriyel=1;
        do {
            nFaktoriyel*=nSayi;
            nSayi--;
        }while(nSayi>1);

        long rFaktoriyel=1;
        do {
            rFaktoriyel*=rSayi;
            rSayi--;
        }while (rSayi>1);

        long fFaktoriyel=1;
        do {
            fFaktoriyel*=fark;
            fark--;
        }while (fark>1);


        System.out.println("Sayilarin kombinasyonu = "+nFaktoriyel/(rFaktoriyel*fFaktoriyel));


    }
}

