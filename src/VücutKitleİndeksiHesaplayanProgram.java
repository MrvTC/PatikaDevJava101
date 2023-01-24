import java.util.Scanner;


public class VücutKitleİndeksiHesaplayanProgram {

    /*

 Vücut Kitle İndeksi Hesaplama
  Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
   Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

   Formül
  Kilo (kg) / Boy(m) * Boy(m)

     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");

        Double boy = sc.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");

        int kilo = sc.nextInt();

        Double VKE = kilo / (boy * boy);

        System.out.println(" Vücut Kitle İndeksiniz : " + VKE);


    }


}
