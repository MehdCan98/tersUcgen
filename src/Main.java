import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.print("Satır Sayısını Giriniz :");
        int satir = input.nextInt();

        for (int i =satir; i>=1; i--) {

            for (int k = (2 * i - 1); k >=1 ; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}