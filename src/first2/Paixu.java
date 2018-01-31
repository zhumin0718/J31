package first2;

public class Paixu {
	public static void main(String[] args) {
//√∞≈›≈≈–Ú
	    int[] arr={4,9,1,3,7};
		for(int i=0;i<arr.length-1;i++) {
		   for(int j=0;j<arr.length-1-i;j++) {
			   if(arr[j]<arr[j+1]) {
				   int temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			   }
           }
		}
		for(int a:arr)
	    System.out.print(a+" "); 
//		—°‘Ò≈≈–Ú
		int[] arr2={40,90,10,30,70};
		for(int m=0;m<arr2.length-1;m++){
			for(int n=m+1;n<arr2.length;n++) {
			   if(arr2[m]<arr2[n]) {
				   int temp=arr2[m];
				       arr2[m]=arr2[n];
				       arr2[n]=temp;
			   }
			}
		}	
		System.out.println();
		for(int b:arr2)
		System.out.print(b+" ");	 		
		
	}
}
	
