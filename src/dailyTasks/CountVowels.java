package dailyTasks;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the words");
		 String a = obj.next();
		 
		 int count =0;
		 a = a.toLowerCase();
		 for(int i =0; i<a.length();i++) {
			 char ch = a.charAt(i);
			 if(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch =='u') {
				 count++;
			 }
		 }
		 System.out.println("number of vowels : "+count);
		 
		 obj.close();

	}

}
