package hipotenus;

import java.util.Scanner;

public class hipotenusApp {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int aKenar,bKenar,cKenar;
        System.out.println("Dik kenar uzunluğu giriniz:");
        int a=scn.nextInt();
        System.out.println("Diğer dik kenarın uzunluğunu giriniz:");
        int b=scn.nextInt();
        System.out.println("Hipotenüs uzunluğunu giriniz:");
        int c= scn.nextInt();;

        double u=(a+b+c)/2;
        double cevre=2*u;
        double alan=Math.sqrt((u*(u-a)*(u-b)*(u*c)));
        System.out.println("Üçgenin alanı:"+alan);

    }
}
