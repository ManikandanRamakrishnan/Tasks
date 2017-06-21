package Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int i,j;
		int m=0;
		int l=1;
		int x=1;
		for(i=1;i<n*2;i++){
			int k=i>=n?n-m++:i;
			for(int z=k;z>0;z--){
				System.out.print(" ");
			}
			l=i>n?n-x++:i;
			for(j=n;j>=k;j--){
				System.out.print(l+++" ");
			}
			System.out.println();
		}
input.close();
	}


}
/* 1 2 3 4 5 6 7 
2 3 4 5 6 7 
3 4 5 6 7 
 4 5 6 7 
  5 6 7 
   6 7 
    7 
   6 7 
  5 6 7 
 4 5 6 7 
3 4 5 6 7 
2 3 4 5 6 7 
1 2 3 4 5 6 7 
*/