package Patterns;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[]  args){
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	for(int i=0;i<n;i++){
	for(int j=n;j>=n-i;j--){
	System.out.print(j);
	}
	System.out.println();
	}
input.close();
}

}
/*7
76
765
7654
76543
765432
7654321*/