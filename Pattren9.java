package Patterns;

import java.util.Scanner;

public class Pattren9 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int count=1;
		for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
		System.out.print(count);
		count=count==0?1:0;
		}
		System.out.println();
		}
input.close();
	}

}
/*1010101
0101010
1010101
0101010
1010101
0101010
1010101
*/