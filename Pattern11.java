package Patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int count=1;
		for(int i=1;i<=n;i++){
			count=1;
		for(int j=i;j>=1;j--){
		System.out.print(count);
		count=count==0?1:0;
		}
		System.out.println();
		}
input.close();
	}

}
/*
1
10
101
1010
10101
101010
1010101*/