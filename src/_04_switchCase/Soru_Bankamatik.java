package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
    /*
   Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
   çıkış işlemlerinin yapıldıgı bir ATM app. code create ediniz
   */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Hoşgeldiniz\nLütfen yapacağınız işlemi seçin\nBakiye öğrenmek için: 1" +
                "\nPara yatırmak için: 2\nPara çekmek için: 3\nÇıkış için: 4");
        int hangiIslem=scan.nextInt();
        int bakiye=1000;

        switch (hangiIslem) {
            case 1:
                System.out.println("Bakiyeniz= " +bakiye+"tl");
                System.out.println("Bizi tercih ettiğiniz için teşekkürler :)");
                break;
            case 2:
                System.out.println("Ne kadar para yatırmak istersiniz");
                int yatirilan=scan.nextInt();
                if (yatirilan<=0){
                    System.out.println("Negatif bir değer girilemez\nLütfen tekrar deneyin");
                }else {
                    int ySonra = (bakiye + yatirilan);
                    System.out.println("Güncel bakiyeniz= "+ySonra+"tl");
                    System.out.println("Bizi tercih ettiğiniz için teşekkürler :)");
                }
                break;
            case 3:
                System.out.println("Ne kadar para çekmek istersiniz");
                int cekilen= scan.nextInt();
                if (cekilen<=0){
                    System.out.println("Negatif bir değer girilemez\nLütfen tekrar deneyin");
                }else if(cekilen>bakiye){
                    System.out.println("Bakiyenizden çok para çekemezsiniz (Bakiyeniz= "+bakiye+"tl)");
                }
                else {
                    int cSonra = (bakiye - cekilen);
                    System.out.println("Güncel bakiyeniz= "+cSonra+"tl");
                    System.out.println("Bizi tercih ettiğiniz için teşekkürler :)");
                }
                break;
            case 4:
                System.out.println("Çıkış yapılmıştır bizi tercih ettiğiniz için teşekkürler :)");
            break;
            default:
                System.out.println("Lütfen geçerli bir yanıt giriniz");

        }

    }
}
