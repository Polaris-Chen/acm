package acm1001;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()) {//hasNextInt()��������ѭ�����ֲ��ҵ���������ʱ����
			int a=sc.nextInt();
			int sum=0;
			while(a>0) {
				sum+=a;
				a--;
			}
		  System.out.println(sum);
		  System.out.println("");
		}
	sc.close();
	}
	
}//Accepted