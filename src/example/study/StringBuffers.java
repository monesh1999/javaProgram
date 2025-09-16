package example.study;

public class StringBuffers {
	/*
	 *string buffer is a class which represent a mutable sequence of character . it mean changing the character
	 *append , insert , delete etc.
	 *it is thread safe,
	 *but not Sychnorized
	 *
	 *append -> 
	 */

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		
		//append
		sb.append("java");
		System.out.println(sb);
		
		//insert
		sb.insert(1, "advance java");
		System.out.println(sb);
		//delete
		sb.delete(1,5);
		System.out.println(sb);
		//reverse
		sb.reverse();
		System.out.println(sb);
		
		//conversion from stringbuffer obj to string obj
		StringBuffer sb1 = new StringBuffer("welcome");
		//creating stringbuilder using consturtor
		String str = sb1.toString();
		System.out.println(str);
		
		StringBuilder sbbb = new StringBuilder(str);
		System.out.println(sbbb);
           //stringbuilder class which reperset a mutable sequence of char this maen u can change the content which syn
	}

}
