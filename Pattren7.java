package Patterns;

import java.util.Scanner;

public class Pattren7 {

	
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			int n=input.nextInt();
			for(int i=0;i<n;i++){
				for(int j=1;j<=n-i;j++){
					System.out.print(j+" ");
				}
				System.out.println();
			}
	input.close();
		

	}

}
/*1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/