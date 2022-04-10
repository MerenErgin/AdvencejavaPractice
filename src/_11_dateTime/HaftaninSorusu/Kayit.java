package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {
    List<Kullanici> kisiler= new ArrayList<>();//Bos list create edidi

    public List<Kullanici> kayitAl(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String isim=scan.nextLine();

        Kullanici k1 = new Kullanici(isim, LocalDateTime.now());

        kisiler.add(k1);

        return kisiler;
    }

    public void sansliKullanici(List<Kullanici> kll){

        for (Kullanici k:kll
             ) {
            if (k.kayitZamani.getSecond()<=10){
                System.out.println("Sansli kisisiniz "+k.name+" agam 5 kilo bal kazandin");
            }else System.out.println("Maalesef sansli kisi degilsiniz "+ k.name +" bal kazanamadin");
        }

    }

    public  void listele(List<Kullanici>kullanicilar){

        for (Kullanici k:kullanicilar
             ) {
            System.out.println("adi: "+k.name+" kayit zamani: "+k.kayitZamani);
        }

    }

}
