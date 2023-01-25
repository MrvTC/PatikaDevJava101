
import java.util.Scanner;

public class ManavKasaProgrami {

    /*

    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

    Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL

    Örnek Çıktı;

      Armut Kaç Kilo ? :0
      Elma Kaç Kilo ? :1
      Domates Kaç Kilo ? :1
      Muz Kaç Kilo ? :2
      Patlıcan Kaç Kilo ? :3
      Toplam Tutar : 21.68 TL

     */

    public static void main(String[] args) {

        double armutFiyat = 2.14,  elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Armut kaç kilo?\n ");

        int armutKilo=sc.nextInt();


        System.out.println("Elma kaç kilo?\n ");

        int elmaKilo=sc.nextInt();


        System.out.println("Domates kaç kilo?\n ");

        int domatesKilo=sc.nextInt();


        System.out.println("Muz kaç kilo?\n ");

        int muzKilo=sc.nextInt();


        System.out.println("Patlıcan kaç kilo?\n ");

        int patlicanKilo=sc.nextInt();


        System.out.println(armutKilo*armutFiyat + domatesKilo*domatesFiyat+
                elmaKilo*elmaFiyat+muzKilo*muzFiyat+patlicanKilo*patlicanFiyat+" TL'dir.");



    }


}

