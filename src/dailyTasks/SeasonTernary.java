package dailyTasks;

import java.util.Scanner;

public class SeasonTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number (1-12):");
        int month = sc.nextInt();

       
        String season = (month >= 6 && month <= 9) ? "Monsoon"
                      : (month == 12 || month <= 2) ? "Winter"
                      : (month >= 3 && month <= 5) ? "Summer"
                      : "Autumn";
        System.out.println("Season: " + season);
    }
}
