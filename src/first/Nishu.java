package first;

public class Nishu {
public static void method1(int i){
	
	 int a,b,c,d,e;
	 a=i/1000;
	 b=(i%1000)/100;
	 c=(i%100)/10;
	 d=i%10;
	 e=1000*d+100*c+10*b+a;
	 System.out.print(e);
  }
public static void main(String[] args) {
	method1(5678);
}
}
