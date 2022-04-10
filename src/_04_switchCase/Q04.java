package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta başlangıcı

        Scanner scan= new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı: 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: 6\nPazar:7" +
                "\nHaftanın kaçıncı gününde olduğunuzu yazınız.");
        int verilenGun=scan.nextInt();

        if (verilenGun<=0 || verilenGun>7){
            System.out.println("Lütfen geçerli bir gün yazınız");
        }else {

            System.out.println("Kaç gün sonrasını öğrenmek istiyorsunuz?");
            int istenenGun = scan.nextInt();

            int bulunanGun = (istenenGun + verilenGun) % 7;

            switch (bulunanGun) {

                case 1:
                    System.out.println(istenenGun + " gün sonra günlerden PAZARTESİ");
                    break;
                case 2:
                    System.out.println(istenenGun + " gün sonra günlerden SALI");
                    break;
                case 3:
                    System.out.println(istenenGun + " gün sonra günlerden ÇARŞAMBA");
                    break;
                case 4:
                    System.out.println(istenenGun + " gün sonra günlerden PERŞEMBE");
                    break;
                case 5:
                    System.out.println(istenenGun + " gün sonra günlerden CUMA");
                    break;
                case 6:
                    System.out.println(istenenGun + " gün sonra günlerden CUMARTESİ");
                    break;
                case 0:
                    System.out.println(istenenGun + " gün sonra günlerden PAZAR");
                    break;
            }
        }
    }

}
