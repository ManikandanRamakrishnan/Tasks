package Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int i,j;
		int m=0;
		for(i=1;i<n*2;i++){
			int k=i>=n?n-m++:i;
			for(int z=k;z>0;z--){
				System.out.print(" ");
			}
			for(j=n;j>=k;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
input.close();
	}

}
/** * * * * * * 
 * * * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 
* * * * * * * 
*/