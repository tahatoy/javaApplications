package notOrtalamasi;

import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        int mat=scn.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        int fiz=scn.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        int kim= scn.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        int turk=scn.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        int tarih=scn.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        int muzik=scn.nextInt();

        double ort=(mat+fiz+kim+turk+tarih+muzik)/6;
        System.out.println("Ortalamanız : "+ort);

        //Sınıf Geçip Geçmemesi?
        boolean kosul = ort >= 60;
        String gectiMi = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gectiMi);

    }
}
