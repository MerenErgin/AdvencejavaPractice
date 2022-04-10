package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ehliyetiniz var mi? \nEvet ise:1 \nHayir ise:0");
        int ehliyet= scan.nextInt();
        if (ehliyet!=0 && ehliyet!=1){
            System.out.println("Lutfen gecerli bir veri giriniz");
        }else {
            System.out.println("Lutfen hizinizi giriniz");
            int hiz = scan.nextInt();

            int ceza;
            int ehliyetCeza=200;

            if (ehliyet == 1) {
                if (hiz < 0) {
                    System.out.println("Lutfen gecerli bir hiz giriniz");
                } else if (hiz >= 55 && hiz < 75) {
                    ceza = 100;
                    System.out.println("Hiz cezaniz : " + ceza + "$");
                } else if (hiz >= 75 && hiz < 85) {
                    ceza = 150;
                    System.out.println("Hiz cezaniz : " + ceza + "$");
                } else if (hiz >= 85 && hiz < 95) {
                    ceza = 320;
                    System.out.println("Hiz cezaniz : " + ceza + "$");
                } else if (hiz > 95) {
                    ceza = 500;
                    System.out.println("Hiz cezaniz : " + ceza + "$");
                } else {
                    System.out.println("Hiz sinirinda seyrediyorsunuz \nIYI YOLCULUKLAR :)");
                }

            } else if (ehliyet == 0) {
                if (hiz < 0) {
                    System.out.println("Lutfen gecerli bir hiz giriniz");
                } else if (hiz >= 55 && hiz < 75) {
                    ceza = 100;
                    ceza = ceza + ehliyetCeza;
                    System.out.println("Hiz cezaniz : " + ceza + "$");
                } else if (hiz >= 75 && hiz < 85) {
                    ceza = 150;
                    ceza = ceza + ehliyetCeza;
                    System.out.println("Hiz cezaniz : " + ceza + "$");
                } else if (hiz >= 85 && hiz < 95) {
                    ceza = 320;
                    ceza = ceza + ehliyetCeza;
                    System.out.println("Hiz cezaniz : " + ceza + "$");
                } else if (hiz > 95) {
                    ceza = 500;
                    ceza = ceza + ehliyetCeza;
                    System.out.println("Hiz cezaniz : " + ceza + "$");
                } else {
                    System.out.println("Hiz sinirinda seyrediyorsunuz ancak ehliyetiniz olmadigi icin cezaniz: "+ ehliyetCeza+"$");
                }
            } else {
                System.out.println("Lutfen gecerli bir hiz giriniz");
            }
        }

    }
}
