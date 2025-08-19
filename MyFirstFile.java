package example.demo;

import java.util.Scanner;

public class MyFirstFile {
	
	static class Calculater{
		
	
	public  int add(int a,int b) {
		
	  return(a+b);
	}
	
	public int sub(int a,int b) {
		
		  return (a-b);
		}
	public int mul(int a,int b) {
		
		  return (a*b);
		}
	public  int div(int a,int b) {
		
		  return (a/b);
		}
	public  int mod(int a,int b) {
		
		  return (a%b);
		}

	
	}
	



	public static void main(String[] argr) {
//		Calculater clc = new Calculater();
		 Scanner obj = new Scanner(System.in);
//		 System.out.println("enter the first number(x) :");
//		 int x =obj.nextInt();
//		 System.out.println("enter the Second number(y) :");
//		 int y =obj.nextInt();
//		 System.out.println("enter the float first number(y1) :");
//		 float y1 =obj.nextFloat();
//		 System.out.println("enter the float Second number(x1) :");
//		 float x1 =obj.nextFloat();
//		 System.out.println("enter the double first number(y1) :");
//		 double y11 =obj.nextDouble();
//		 System.out.println("enter the double Second number(x1) :");
//		 double x11 =obj.nextDouble();
//		 String str1,str2,str3;
//		 System.out.println("enter the first string(str1) :");
//		 str1 =obj.next();
//		 System.out.println("enter the Second string(str2) :");
//		 str2 =obj.next();
//		 int sum = clc.add(x,y);
//		 int  sub = clc.sub(x,y);
//		 int mul = clc.mul(x,y);
//		 int div = clc.div(x,y);
//		 int mod = clc.mod(x,y);
//		
//		System.out.println("Arithmectic :");
//		System.out.println("SUM = "+ sum);
//	    System.out.println("SUB = "+ sub);
//	    System.out.println("MUL = "+ mul);
//	    System.out.println("DIV = "+ div);
//	    System.out.println("MOD = "+ mod);
//	    
//	    float z1 = y1+x1;
//	    System.out.println("Float --> sum :" +z1);
//	    float z12 = y1-x1;
//	    System.out.println("Float --> sub :" +z12);
//	    float z13 = y1*x1;
//	    System.out.println("Float --> mul :" +z13);
//	    float z14 = y1/x1;
//	    System.out.println("Float --> div :" +z14);
//	    float z15 = y1%x1;
//	    System.out.println("Float --> mod :" +z15);
//	    
//	    double z11 = y11+x11;
//	    System.out.println("double --> sum :" +z11);
//	    double z123 = y11-x11;
//	    System.out.println("double--> sub :" +z123);
//	    double z134 = y11*x11;
//	    System.out.println("double--> mul :" +z134);
//	    double z145 = y11/x11;
//	    System.out.println("double --> div :" +z145);
//	    double z155 = y11%x11;
//	    System.out.println("double --> mod :" +z155);
//	    
//		 str3=str1+str2;
//		 System.out.println("string 1 + string 2 = concatenated :"+str3);
		 
		 System.out.println("enter the first number(c) :");
		 int c =obj.nextInt();
		 System.out.println("enter the Second number(d) :");
		 int d =obj.nextInt();
		 
		 System.out.println(c<d);
		 System.out.println(c>d);
		 System.out.println(c==d);
		 System.out.println(c!=d);
		 System.out.println(c>=d);
		 System.out.println(c<=d);
		 
		obj.close();
	    
		
		
	}

}
