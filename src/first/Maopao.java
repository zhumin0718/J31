package first;

public class Maopao {
 public static void mathod2() {
    int[] a = {3,9,6,8,10};
	for(int i=0;i<a.length-1;i++ ) {
    for(int j=0;j<a.length-1-i;j++) {
		if(a[j]<a[j+1]) {
			int temp=a[j+1];
			a[j+1]=a[j];
			a[j]=temp;
		}	
	}
	for(int s:a) {
		System.out.print(s+",");
	}
	System.out.println();
	}
  }
 public static void main(String[] args) {
	 mathod2();
 }
}
