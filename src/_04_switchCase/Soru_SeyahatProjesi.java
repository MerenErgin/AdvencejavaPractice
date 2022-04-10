package _04_switchCase;

import java.util.Scanner;

public class Soru_SeyahatProjesi {
       /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.
        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
           todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.0
          İşlemlerde direkt bunları cağırabilirsiniz.
         todo İLK OLARAK;
        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---
        (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.
        1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.
        todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:
         Rota = Frankfurt yazdırın.
        Frankfurt km hesabı işlemi yapın.
        son olarak konsolda: Frankfurt 15 Euro         yazsın.
        todo  case: KÖLN ise
      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.
       son olarak konsolda:  Köln   20 Euro             yazsın.
       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.
       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)
        case:2 ise
        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.
        todo  Son olarak yolculugunuzu check edin;
        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.
         */
       public static void main(String[] args) {
           Scanner scan= new Scanner(System.in);
           System.out.println("***** Seyehat şirketimize hoşgeldiniz *****");
           System.out.println("Nereye gitmek istersiniz (her 20km başına 5 euro)");
           System.out.println("KOLN(80km) için: 1" + "\nFRANKFURT(60km) için: 2");
           int hedef=scan.nextInt();
           double frUcret= (60/20)*5;
           double klUcret= (80/20)*5;

           switch(hedef){
               case 1:
                   System.out.println("Rota= FRANKFURT");
                   System.out.println("Frankfurt "+frUcret+"euro");
                   System.out.println("Kaç kişi seyehat edeceksiniz? (en fazla iki kişi olabilir)");
                   int kisi = scan.nextInt();

                   switch (kisi){
                       case 1:
                           System.out.println("1 kişilik bilet talep ettiniz\nBilet tutarınız= "+frUcret+"euro");
                           break;
                       case 2:
                           System.out.println("2 kişilik bilet talep ettiniz\nBilet tutarınız= "+(frUcret*2)+"euro");
                           break;
                       default:
                           System.out.println("Hatalı giriş yaptınız");
                           break;
                   }
               break;
               case 2:
                   System.out.println("Rota= KOLN");
                   System.out.println("Frankfurt "+klUcret+"euro");
                   System.out.println("Kaç kişi seyehat edeceksiniz? (en fazla iki kişi olabilir)");
                   int kisiK = scan.nextInt();

                   switch (kisiK){
                       case 1:
                           System.out.println("1 kişilik bilet talep ettiniz\nBilet tutarınız= "+klUcret+"euro");
                           break;
                       case 2:
                           System.out.println("2 kişilik bilet talep ettiniz\nBilet tutarınız= "+(klUcret*2)+"euro");
                           break;
                       default:
                           System.out.println("Hatalı giriş yaptınız");
                           break;
                   }
                   break;
               default:
                   System.out.println("Hatalı giriş yaptınız");
           }



       }
}
