package Patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.printf("%2d ",j);
		}
		System.out.println();
	}
input.close();
	}

}