package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Cevirim yapacağınız işlemi seçiniz");
        String islem=scan.next();
        System.out.println("Çevirim miktarını girin: ");
        double miktar= scan.nextDouble();
        donustur(islem,miktar);

    }

    private static void donustur(String islem, double miktar) {

        switch (islem) {
            case "saat":
                System.out.println("merak ettiğin saat "+miktar*60*60+" saniyedir");
                break;
            case "mil":
                System.out.println("merak ettiğin mil "+miktar*1.61+" kilometredir");
                break;
            case "kg":
                System.out.println("merak ettiğin kilo "+miktar*1000+" gramdır");
                break;
            default:
                System.out.println("Lütfen geçerli bir işlem yapın (saat, mil, kg)");

        }

    }
}

