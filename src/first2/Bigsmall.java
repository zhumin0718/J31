package first2;

public class Bigsmall {
public static void method() {
	//���Լ��	
	/*int i=10;
	int j=6;
	int k=i>j?j:i;
  for(int a=k;a>0;a--) {
       if(i%a==0&&j%a==0) {
	      System.out.println("���Լ��Ϊ"+a);
	      break;
       }	
  }	*/
	//��С������  
	int i=10;
	int j=6;
	int k=i<j?j:i;
	for(int n=k;n<(i*j);n=n+k) {
		if(n%i==0&&n%j==0) {
			System.out.println("��С������Ϊ"+n);
			break;
		}
	}
 }
}
