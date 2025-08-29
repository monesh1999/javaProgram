package example.demo;

public class Switchcase {

	public static void main(String[] args) {
		//why float double and boolean are not allowed?
		//because : switch works by matching discrete values using equity(==).
		//float and double are not good for precise equality comparisons due to rounding issues.
		//boolean only has 2 values ; better handle with if-else.
		
		//the switch statement allow you to compare one expression against multiple 
		  //contsint value and run different core depending on value matches
		
		int month =3;
		String monthString;
		switch(month) {
		case 1: monthString="January";break;
		case 2: monthString="Febrauey";break;
		case 3: monthString="March";break;
		case 4: monthString="April";break;
		case 5: monthString="May";break;
		case 6: monthString="june";break;
		case 7: monthString="july";
		break;
		default:monthString="Invalid month";
		}
		System.out.println(monthString);
		
		int fruit =3;
		String fruitString;
		switch(fruit) {
		case 1: fruitString="apple"; break;
		case 2: fruitString="banana"; break;
		case 3: fruitString="orange"; break;
		case 4: fruitString="graphs"; break;
		case 5: fruitString="pineapple"; break;
		
		
		default:fruitString="Invalid furit";
		}
		System.out.println(fruitString);

	}

}
