import java.util.Scanner;

public class NotOrtalama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int turkce, mat, fizik, kimya, tarih, muzik;

        System.out.println("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        double ort = ((turkce + mat + fizik + kimya + tarih + muzik) / 6);

        System.out.println(ort > 60 ? "Tebrikler geçtiniz :) " : "Maalesef, kaldınız :( ");


    }
}
