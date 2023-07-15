package age_calculation;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int day;
        int month;
        int year;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Hangi Yılda Doğdunuz : ");
        year = input.nextInt();
        
        System.out.print("Kaçıncı Ayda Doğdunuz : ");
        month = input.nextInt();
        
        System.out.print("Ayın Kaçında Doğdunuz : ");
        day = input.nextInt();
        
        Age myAge = new Age();
        
        System.out.println(myAge.calculateAge(year, month, day) + " Yaşındasınız");
        
    }
}
