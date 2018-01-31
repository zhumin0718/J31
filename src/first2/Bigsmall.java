package first2;

public class Bigsmall {
public static void method() {
	//最大公约数	
	/*int i=10;
	int j=6;
	int k=i>j?j:i;
  for(int a=k;a>0;a--) {
       if(i%a==0&&j%a==0) {
	      System.out.println("最大公约数为"+a);
	      break;
       }	
  }	*/
	//最小公倍数  
	int i=10;
	int j=6;
	int k=i<j?j:i;
	for(int n=k;n<(i*j);n=n+k) {
		if(n%i==0&&n%j==0) {
			System.out.println("最小公倍数为"+n);
			break;
		}
	}
 }
}
