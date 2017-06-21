package Patterns;

import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=n;
		int n1=n*2-1;
		for(int i=1;i<=n1;i++){
			int k=i>=n?m--:i;
			for(int l=k;l>=1;l--){
				System.out.print(" ");
			}
			
			for(int j=k;j<=n;j++){
				System.out.print(j+"");
				
			}
			System.out.println();
		}
input.close();
	}

}
/* 1234567
234567
34567
 4567
  567
   67
    7
   67
  567
 4567
34567
234567
1234567*/
