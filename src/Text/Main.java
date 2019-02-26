package Text;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()) {
			int n =sc.nextInt();
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
			
				double arr []=new double [21];
				for (int j = 3; j < arr.length; j++) {
					arr[1]=0;
					arr[2]=1;
					arr[j]=(j-1)*(arr[j-1]+arr[j-2]);
				}double drr[]=new double [21];
				
				for (int j = 3; j < 21; j++) {
				drr[1]=1;
				drr[2]=2;
					drr[j]=	j*drr[j-1];
				}
					System.out.printf("%.2f",arr[a]/drr[a]*100);
					System.out.print("%");
					System.out.println();
				
				}
				}
		}
	}
