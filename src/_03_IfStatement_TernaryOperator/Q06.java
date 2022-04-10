package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

        Scanner scan= new Scanner(System.in);
        System.out.println("X ve Y degerlerinizi sirasiyla giriniz: ");
        int x= scan.nextInt();
        int y= scan.nextInt();

        if (x>0 && y>0){
            System.out.println("Girdiginiz kordinat 1. bolgeye ait");
        }else if(x<0 && y>0) {
            System.out.println("Girdiginiz kordinat 2. bolgeye ait");
        }else if(x<0 && y<0) {
            System.out.println("Girdiginiz kordinat 3. bolgeye ait");
        }else if(x>0 && y<0) {
            System.out.println("Girdiginiz kordinat 4. bolgeye ait");
        }else if(x!=0 && y==0) {
            System.out.println("Girdiginiz kordinat x eksenine ait");
        }else if(x==0 && y!=0) {
            System.out.println("Girdiginiz kordinat y eksenine ait");
        }else System.out.println("Girdiginiz kordinat orjine ait");

    }
}
