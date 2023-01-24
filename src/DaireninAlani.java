import java.util.Scanner;

public class DaireninAlani {

    public static void main(String[] args) {

        int yaricap, CentralAngle;

        double pi = 3.14;

        Scanner sc = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        yaricap = sc.nextInt();
        System.out.println("Dairenin merkez ölçüsünü giriniz: ");
        CentralAngle=sc.nextInt();
        double area=( pi * (yaricap*yaricap) * CentralAngle) / 360;
        System.out.println("Dairenin alanı: " + area );
    }

}
