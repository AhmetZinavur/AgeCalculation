package age_calculation;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int day;
        int month;
        int year;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Bu uygulama yaşınızı hesaplamaktadır.");

        System.out.print("Gün : ");
        day = input.nextInt();

        System.out.print("Ay : ");
        month = input.nextInt();

        System.out.print("Yıl: ");
        year = input.nextInt();

        Age myAge = new Age();

        System.out.println(myAge.calculateAge(year, month, day) + " Yaşındasınız");

    }
}
