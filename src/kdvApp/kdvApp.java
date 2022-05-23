package kdvApp;

import java.util.Scanner;

public class kdvApp {
    public static void main(String[] args) {
        double tutar,kdvOran=0.18,kdvTutar,kdvlitutar;
        Scanner scn=new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz:");
        tutar=scn.nextDouble();
        if (tutar>0 && tutar<=1000){
            kdvOran=0.18;
            kdvTutar=tutar*kdvOran;
            kdvlitutar=tutar+kdvTutar;
        }
        else {
            kdvOran=0.08;
            kdvTutar=tutar*kdvOran;
            kdvlitutar=tutar+kdvTutar;
        }
        System.out.println(kdvlitutar);
    }

}
