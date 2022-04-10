package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q14 {
    /* Günün sorusu: if statement
      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

        ax^2 + bx + c;

        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("ax^2 + bx + c;\nLütfen kat sayilarini sirayla girin");

        System.out.println("a değerini giriniz: ");
        double a = scan.nextDouble();
        System.out.println("b değerini giriniz: ");
        double b = scan.nextDouble();
        System.out.println("c değerini giriniz: ");
        double c = scan.nextDouble();

        double delta= (b*b)-(4*a*c);

        if (delta>0){
            double kok1=((-1*b)+Math.sqrt(delta)/(2*a));
            double kok2=((-1*b)-Math.sqrt(delta)/(2*a));
            System.out.println("2 tane kok var\nKök 1: "+kok1+"kök 2: "+kok2);
        }else if(delta==0){
            double kok=(-1*b)/(2*a);
            System.out.println("Bir tane kök vardır kök: "+kok);
        }else{
            System.out.println("Kök yoktur");
        }
    }
}
