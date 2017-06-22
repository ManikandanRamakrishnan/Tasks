package Patterns;

import java.util.Scanner;

public class Pattern13 {
	public static void main(String[]  args){
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	for(int i=1;i<=n;i++){
		int sum=i;
		int k=n-1;
		System.out.print(i+" ");
	for(int j=1;j<i;j++){
	sum+=k--;
	System.out.print(sum+" ");
	}
	System.out.println();
	}
input.close();
}

}
/*1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 */