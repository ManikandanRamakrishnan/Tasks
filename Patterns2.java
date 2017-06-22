package Patterns;

import java.util.Scanner;

public class Patterns2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int k=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j<=n-k){
				System.out.print("1");
				}
				else{
					System.out.print(k);
				}
			}
			k++;
			System.out.println();
		}
input.close();
	}

}
/*
1111111
1111122
1111333
1114444
1155555
1666666
7777777*/
