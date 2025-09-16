package DailyTaskOops;
/*
 to access the inner class ,create an object of the outer class , and than create an object of the inner class.
 example Get then Create an object of the inner class
 */


class OuterClass {
	  int x = 10;

	  class InnerClass {
	    int y = 5;
	  }
	}

public class JavaInnerClass {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		
		OuterClass.InnerClass myInner = outer.new  InnerClass();
		System.out.println(outer.x +" "+myInner.y);

	}

}
