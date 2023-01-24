import java.util.Scanner;

public class KDVTutariHesaplayanProgram {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen tutar giriniz: ");
        double tutar=sc.nextDouble();

        if (tutar>0 && tutar<1000){
            double KDVoran=tutar*0.18;
            System.out.println(KDVoran + " KDV tutarınızdır.");

        } else if (tutar>1000) {

            double KDVoran1=tutar*0.08;
            System.out.println(KDVoran1 + "KDV tutarınızdır. ");

        }else System.out.println("hatalı giriş yaptınız");
    }
}
