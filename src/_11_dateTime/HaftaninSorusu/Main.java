package _11_dateTime.HaftaninSorusu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int islem;

        Kayit yeniKayit=new Kayit();
        List<Kullanici> kisi=new ArrayList<>();

        boolean cikilsinMi=false;

        while (!cikilsinMi){
            System.out.println("lutfen\n1:Kayit al\n2:Sansli kisi bul\n3:Kisileri listele\n4Cıkıs");
            System.out.println("isleminizi secin");
            islem= scan.nextInt();

            switch (islem){
                case 1:
                    kisi=yeniKayit.kayitAl();
                break;
                case 2:
                    yeniKayit.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMi=true;
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz");
            }

        }

    }
}
