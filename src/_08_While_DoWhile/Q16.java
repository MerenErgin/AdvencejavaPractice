package _08_While_DoWhile;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.

        String pin="20Java22";
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pininizi gitiniz");
        boolean dougruMu=true;
        int hak=3;

        do {

            String girilenPin=scan.nextLine();
            if (!pin.equals(girilenPin)){
                hak--;
                System.out.println("Sifrenizi yanlis girdiniz \nKalan hakkiniz: "+hak);
                if (hak==0){
                    System.out.println("Pininiz bloke oldu:(");
                }
            }else{
                System.out.println("Sifreniz kabul edildi :)");
                break;
            }

        }while (hak>=1);


    }
}
