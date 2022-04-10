package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        ArrayList<String> isimler=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String> aOlmayanIsimler= new ArrayList<>();

        for (String w: isimler
             ) {
            if (!w.toLowerCase().contains("a")){
                aOlmayanIsimler.add(w);
            }
        }
        System.out.println("a olmayan isimler: "+aOlmayanIsimler);

    }


}
