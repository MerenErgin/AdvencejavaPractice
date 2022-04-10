package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {




        /* TASK :
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.

        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!

        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.

        5. final notu double değerinde olmalı. (örn: 65,5)

        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.

        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.



                                        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasında ise  BA,
                                                                        70(70 dahil)   ile 80 arasında ise BB,
                                                                        60(60dahil) ile 70 arasında ise CB,
                                                                        50(50 dahil) ile 60 arasında ise CC,
                                                                     40(40 dahil) ile 50 arasında ise DC,
                                                                     30(30 dahil) ile 40 arasında ise DD,
                                                                     30 'dan düşük ise FF            gelmeli.
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen vize notunu giriniz: ");
        double vize=scan.nextDouble();
        System.out.println("Vize'nin yuzdesini giriniz: ");
        double vizeOran=scan.nextDouble()/100;

        System.out.println("Lutfen final notunu giriniz: ");
        double fnal=scan.nextDouble();
        System.out.println("Final'in yuzdesini giriniz: ");
        double finalOran=scan.nextDouble()/100;

        if (vizeOran+finalOran!=1 || vize<0 || vize>100 || fnal<0 || fnal>100){
            System.out.println("Lutfen girdiginiz verileri kontrol edin");
        }else {
                double notOrtalama = vize * vizeOran + fnal * finalOran;
                System.out.println("Not ortalamaniz: " + notOrtalama);

                if (notOrtalama >= 90) {
                    System.out.println("Harf ortalamaniz: AA");
                } else if (notOrtalama < 90 && notOrtalama >= 80) {
                    System.out.println("Harf ortalamaniz: BA");
                } else if (notOrtalama >= 70) {
                    System.out.println("Harf ortalamaniz: BB");
                } else if (notOrtalama >= 60) {
                    System.out.println("Harf ortalamaniz: CB");
                } else if (notOrtalama >= 50) {
                    System.out.println("Harf ortalamaniz: CC");
                } else if (notOrtalama >= 40) {
                    System.out.println("Harf ortalamaniz: DC");
                } else if (notOrtalama >= 30) {
                    System.out.println("Harf ortalamaniz: DD");
                } else {
                    System.out.println("Harf ortalamaniz: FF");
                }


        }
    }
}
