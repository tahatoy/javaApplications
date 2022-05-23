package vucutKitle;

import java.util.Scanner;

public class vucutKitleApp {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double boy,kilo;
        System.out.println("Metre cinsinden boyunuzu giriniz:");
        boy=scn.nextDouble();
        System.out.println("Kilonuzu giriniz:");
        kilo=scn.nextDouble();
        double index=kilo/boy*boy;;
        System.out.println("Vücut kitle endeksiniz:"+index);
    }
}
