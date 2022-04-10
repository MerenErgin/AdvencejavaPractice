package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */
        String kelime= "ghost";

        System.out.println(ilkIkisiz(kelime));


    }

    private static String ilkIkisiz(String kelime) {
        String kalanHarfler="";

        if (kelime.startsWith("gh")){
            kalanHarfler=kelime;
        }else if (kelime.startsWith("g")){
            kalanHarfler=kelime.charAt(0)+kelime.substring(2);
        }else if (kelime.charAt(1)=='h'){
            kalanHarfler=kelime.substring(1);
        }else {
            kalanHarfler=kelime.substring(2);
        }

        return kalanHarfler;
    }


}

