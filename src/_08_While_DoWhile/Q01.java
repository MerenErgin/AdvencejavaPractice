package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
       /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Luutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        int kuplerToplami=0;
        int rakam=0;
        int ilkDeger=sayi;


        do {
            rakam=sayi%10;
            kuplerToplami+=rakam*rakam*rakam;
            sayi/=10;
        }while (sayi!=0);
        if (kuplerToplami==ilkDeger){
            System.out.println("Armstrong sayisi");
        }else{
            System.out.println("amstrong sayisi degil");
        }

    }

}
