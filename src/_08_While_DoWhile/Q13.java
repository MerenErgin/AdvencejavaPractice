package _08_While_DoWhile;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz");

        int urunAdedi= scan.nextInt();
        double fiyat=0;
        double toplam=0;
        int i=1;

        while (i<=urunAdedi){
            System.out.println("aldiginiz "+i+". urunun fiyatini giriniz: ");
            fiyat= scan.nextDouble();
            i++;
            toplam+=fiyat;
        }
        System.out.println("Musteri kartiniz var mi? (E/H)");
        char musterikart=scan.next().toUpperCase().charAt(0);

        if (musterikart=='E'){
            if (urunAdedi>=10){
                toplam*=0.8;
                System.out.println("%20 indirim kazandiniz odemeniz gereken fiyat: "+toplam);
            }else{
                toplam*=0.85;
                System.out.println("%15 indirim kazandiniz odemeniz gereken fiyat: "+toplam);
            }

        }else if (musterikart=='H'){
            if (urunAdedi>=10){
                toplam*=0.85;
                System.out.println("%15 indirim kazandiniz odemeniz gereken fiyat: "+toplam);
            }else{
                toplam*=0.9;
                System.out.println("%10 indirim kazandiniz odemeniz gereken fiyat: "+toplam);
            }
        }else{
            System.out.println("Hatali giris yaptiniz");
        }

    }
}
