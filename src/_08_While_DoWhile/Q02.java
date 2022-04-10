package _08_While_DoWhile;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String  kelime= scan.nextLine();

        int index=0;

        do {

            if (index%2!=0){
                System.out.print(kelime.charAt(index)+" ");
            }
            index++;


        }while(index<kelime.length());

    }

}
