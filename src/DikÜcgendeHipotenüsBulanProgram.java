import java.util.Scanner;

public class DikÜcgendeHipotenüsBulanProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;
        double c;
        System.out.println("Enter the first side: ");
        a = sc.nextInt();

        System.out.println("Enter the second side: ");
        b = sc.nextInt();

        System.out.println("your hypotenus: " + (c = Math.sqrt(a * a + b * b)));


    }
}
