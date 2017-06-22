package Patterns;

import java.util.Scanner;

public class Pattern14 {
	public static void main(String[]  args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(i==j){
				System.out.print(i);
			}else
		System.out.print("0");
		}
		System.out.println();
		}
	input.close();
	}

}
/*0000000
0100000
0020000
0003000
0000400
0000050
0000006*/