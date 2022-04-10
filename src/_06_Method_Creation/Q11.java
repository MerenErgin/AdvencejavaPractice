package _06_Method_Creation;

import java.util.Scanner;

public class Q11 {
    static int bakiye = 1000; // static oldugu icin tum methodlarda kullanilabilir
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
         /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
  ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz
   */
        System.out.println("      ********       ");
        System.out.println("ATM'ye hoş geldiniz");
        System.out.println("Bakiye sorgulama için: 1\nPara yatırmak için: 2\nPara çekmek için: 3\nÇıkış için: 4");

        secim();
    }

    private static void secim() {
        System.out.println("Yapacaginiz islemi seçiniz");
        int secim=scan.nextInt();
        switch (secim){
           case 1:
               bakiyeSorgulama();
               break;
           case 2:
                paraYatirma();
                break;
           case 3:
               paraCek();
               break;
           case 4:
               cikis();
               break;
            default:
                hataliIslem();

        }

    }

    private static void hataliIslem() {
        System.out.println("Lütfen geçerli bir işlem yapın");

        cikisKarar();
    }

    private static void cikisKarar() {
        System.out.println("*******");
        System.out.println("İşleme devam etmek için: 1\nÇıkış için: 0\nTuşlayınız");
        int karar=scan.nextInt();
        if (karar==1){
            secim();
        }else if(karar==2){
            cikis();
        }else hataliIslem();

    }

    private static void paraCek() {
        System.out.println("Lütfen ne kadar para çekmek istediğinizi yazın");
        int cekilenPara=scan.nextInt();
        if (cekilenPara>bakiye){
            System.out.println("Bakiyenizden fazla para çekemezsiniz");
            System.out.println("Bakiyeniz= "+bakiye+"tl");
        }else if(cekilenPara<0){
            hataliIslem();
        }else{
            bakiye-=cekilenPara;
            System.out.println("Güncel bakiyeniz= "+bakiye+"tl");
        }
        cikisKarar();
    }

    private static void paraYatirma() {
        System.out.println("Lütfen ne kadar yatıracağınızı yazın");
        int yatirilanPara=scan.nextInt();
        if (yatirilanPara<=0){
            hataliIslem();
        }else {
            bakiye += yatirilanPara;
            System.out.println("Güncel bakiyeniz= "+bakiye+"tl");
        }
        cikisKarar();
    }

    private static void bakiyeSorgulama() {
        System.out.println("bakiyeniz: "+bakiye+"tl");
        cikisKarar();
    }

    private static void cikis() {
        System.out.println("Çıkışınız başarıyla tamamlanmıştır iyi günler dileriz :)");
    }


}



