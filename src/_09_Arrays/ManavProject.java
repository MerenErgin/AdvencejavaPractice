package _09_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavProject {
    static List<String> urunListesi = new ArrayList<String>();
    static List<Double> urunFiyatlari = new ArrayList<Double>();
    static double toplamOdeme;
    static Scanner scan=new Scanner(System.in) ;

    public static void main(String[] args) {
        /*
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */



        urunListesi.add("domatez urun kodu: 1");
        urunListesi.add("muz urun kodu: 2");
        urunListesi.add("elma urun kodu: 3");
        urunListesi.add("erik urun kodu: 4");
        urunListesi.add("cilek urun kodu: 5");

        urunFiyatlari.add(15.0);
        urunFiyatlari.add(18.0);
        urunFiyatlari.add(8.0);
        urunFiyatlari.add(47.0);
        urunFiyatlari.add(27.0);

        System.out.println(urunListesi);
        musteriSecim();

    }

    private static void musteriSecim() {
        System.out.println("Sectiginiz urun kodunu girin");
        int secim= scan.nextInt();
        System.out.println("Kac kilo alacaginizi giriniz");
        double kilo=scan.nextDouble();
        double urunTutari=kilo*urunFiyatlari.get(secim-1);

        toplamOdeme+=urunTutari;

        System.out.println("Devam etmek istiyorsaniz 1'e\nOdeme icin 2'ye basiniz");

        int dewamke=scan.nextInt();
        if (dewamke==1){
            musteriSecim();
        }else{
            kasa();
        }

    }

    private static void kasa() {

        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz :)");
        System.out.println("Tutariniz= "+ toplamOdeme+"tl");

    }
}
