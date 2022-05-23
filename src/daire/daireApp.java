package daire;

import java.util.Scanner;

public class daireApp {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double r;
        System.out.println("Dairenin yarı çapını giriniz:");
        r=scn.nextDouble();
        double alan=Math.PI*r*r;
        double cevre=2*Math.PI*r;
        System.out.println("Dairenin alanı:"+alan);
        System.out.println("Dairenin çevresi:"+cevre);

        double pi=3.14;
        double a;
        System.out.println("Merkez açıyı giriniz:");
        a=scn.nextDouble();
        double dilim=(pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı:"+dilim);
    }
}
