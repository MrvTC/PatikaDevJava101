import java.util.Scanner;

public class TaksimetreHesaplayanProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("kaç km yol gideceksiniz?");
        double KM = sc.nextDouble();

        double Price = 10 + (KM * 2.20) ;

        if (Price<20){
            System.out.println(20);
        }else System.out.println(Price);
    }

}
