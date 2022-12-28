package com.percholas.java_basics;

public class JavaBasicsClass {
public static void main(String[]args) {
	int a=5;
	int b=6;
	int c=a+b;
	System.out.println(c);
	
	double d=12.1d;
	double e=1.2d;
	double f=d+e;
	System.out.println(f);
	
	double g=12.6d;
	double h=12.3d;
	double i=g/h;
	System.out.println(i);
	
	double j=12.6d;
	double k=12.3d;
	int l=(int) (j/k);
	int myInt=l;
	double myDouble=myInt;
	System.out.println(l);//this is question 5
	
	int m=11;
	double n=11.3d;
	double o=m+n;//the sum must be a double
	System.out.println(o);
	
	int p=88;
	int r=44;
	int s=p/r;
	System.out.println(s);
	
	double t=88.2d;// now p becomes a double t
	int u=44;
	double v=t/u;
	System.out.println(v);//result will become a double instead of an integer
	
	
	int x =5;
	int y=6;
	int q=y/x;
	System.out.println(q);//console printed an integer. honestly thought the answer was going to be 1.2 down in the console.
	
	int xx=5;
	double yy= 6.0d;
	double qq=yy/xx;
	System.out.println(qq);//wait huh?, now the console printed a double.
	
	double pi=3.14;//pi constant
	int w=23;
	System.out.println(pi);
	
	int coffee=7;
	int cappucino=6;
	int espresso=8;
	int subtotal=3*coffee+4*cappucino+2*espresso;
	double salestax=0.21d;
	double totalsales= subtotal+salestax;
	
	System.out.println(totalsales);
	
	
	
	
	
	
	
	
	
	
			
}
}
