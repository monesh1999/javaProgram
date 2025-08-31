package example.demo;
enum day{mon,tues,wed,fri};
public class EnumSwitch {

	
	
	//enum stands for enumurator   in which speacial datatype and use to define fix set of constant value it is typesafety
	public static void main(String[] args) {
		day y =day.fri;
		String days11;
		switch(y) {
		case fri :days11="its sunny day";
		break;
		case mon :days11="its normal day";
		break;
		default :days11="no days";
		}
		System.out.println(days11);

	}

}
