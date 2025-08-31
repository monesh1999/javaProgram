package dailyTasks;

import java.util.Scanner;

enum BankRank {
    GRADE_1,   
    GRADE_2,   
    GRADE_3;  

   
    public static BankRank fromAverage(int average) {
        if (average >= 80) {
            return GRADE_1;
        } else if (average >= 60) {
            return GRADE_2;
        } else {
            return GRADE_3;
        }
    }
}

public class gradeBasedUsingEnum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        
        System.out.print("Enter number of subjects: ");
        int n = obj.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter mark for subject " + i + ": ");
            sum += obj.nextInt();
        }

        
        int average = sum / n;

       
        BankRank rank = BankRank.fromAverage(average);

        
        switch (rank) {
            case GRADE_1:
                System.out.println("Average: " + average + " → Bank Rank: GRADE_1 (Top Rank)");
                break;
            case GRADE_2:
                System.out.println("Average: " + average + " → Bank Rank: GRADE_2 (Middle Rank)");
                break;
            case GRADE_3:
                System.out.println("Average: " + average + " → Bank Rank: GRADE_3 (Lowest Rank)");
                break;
        }
    }
}
