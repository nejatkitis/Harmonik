import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        double result = 0;
        double i = 1;
        double n;
        Scanner sayi = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = sayi.nextDouble();

        while (i<=n){
            result += 1/i;
            i++;
        }
        System.out.println("Sonuç : "+result);

    }
}
