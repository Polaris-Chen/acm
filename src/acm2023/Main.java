package acm2023;//��һ������Ŀ������������֪��ΪʲôDecimalFormat���У���printf(��%��2f����x)�Ϳ���Ac

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
public void score() {
	Scanner sc=new Scanner(System.in);
	DecimalFormat df=new DecimalFormat("0.00");
	while(sc.hasNext()) {
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		double[] avgScore=new double[m];
		//��ֵ
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		//��ѧ��ƽ���ɼ�
		for(int i=0;i<n;i++) {
			double sum=0;
			for(int j=0;j<m;j++) {
				sum=sum+arr[i][j];
			}
			double avgStudent=sum/m;
			System.out.printf("%.2f",avgStudent);
			if(i!=n-1) System.out.print(" ");
		}
		System.out.println();
		//��γ�ƽ���ɼ�
		for(int j=0;j<m;j++) {
			double sum=0;
			for(int i=0;i<n;i++) {
				sum=sum+arr[i][j];
			}
			avgScore[j]=sum/n;
			System.out.printf("%.2f",avgScore[j]);
			if(j!=m-1)System.out.print(" ");
		}
		System.out.println();
		
		//����ƾ���С��ƽ���ɼ���ѧ������
		int count=0;
		for(int i=0;i<n;i++) {
			boolean flag=false;
			for(int j=0;j<m;j++) {
				if(arr[i][j]>=avgScore[j]) {
					flag=true;
				}
				else {
					flag=false;
					break;
				}
			}
			if(flag)count++;
		}
		System.out.println(count);
		System.out.println();
	}
}

public  static void main(String[] args) {
Main ma=new Main();
ma.score();

} 
}
