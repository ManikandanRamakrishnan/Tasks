package Tasks;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int i;
		int[] number=new int[n];
		for(i=0;i<number.length;i++)
		{
			number[i]=input.nextInt();
		}
		int m=n-1;
		i=0;
		while(i<n/2){
			int temp=number[i];
			number[i]=number[m];
			number[m]=temp;
			i++;
			m--;
		}for(i=0;i<n;i++){
		System.out.print(number[i]+" ");
		}
		input.close();

	}

}
