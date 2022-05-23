package manavUygulamasi;

import java.util.Scanner;

public class manavApp {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int armut,elma,domates,muz,patlican;
        double armutF,elmaF,domatesF,muzF,patlicanF;

        System.out.println("Armut kaç kilo? :");
        armut=scn.nextInt();
        armutF=armut*2.14;

        System.out.println("Elma kaç kilo? :");
        elma=scn.nextInt();
        elmaF=elma*3.67;

        System.out.println("Domates kaç kilo? :");
        domates=scn.nextInt();
        domatesF=domates*1.11;

        System.out.println("Muz kaç kilo? :");
        muz=scn.nextInt();
        muzF=muz*0.95;

        System.out.println("Patlıcan kaç kilo? :");
        patlican=scn.nextInt();
        patlicanF=patlican*5;

        double toplam=armutF+elmaF+domatesF+muzF+patlicanF;
        System.out.println("Toplam tutar:"+toplam);

    }
}
