package acm2007;
//Accepted û˵m��n˭��....�����
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int even=0,odd=0;
		int left=sc.nextInt();
		int right=sc.nextInt();
		if(left>right) {
			int temp=left;
			left=right;
			right=temp;
		}
		for(int i=left;i<right+1;i++) {
			if(i%2==0) {
				even+=Math.pow(i,2);
			}
			else {
				odd+=Math.pow(i,3);
			}
			
		}
		System.out.println(even+" "+odd);
	}
}
}
