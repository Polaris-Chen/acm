package acm2037;//Accepted  �˴�����ʹ����̽�Ŀʱ��������ѡ��

//���� ----===-----
//     -====-======
// ����ֻ����������Ŀ ���ѡ������̽�Ŀ�����Ϊ1
//��Ϊ��̽�Ŀʱ��û�п��ǿհ׵�ʱ�� 

import java.util.Scanner;
//������
public class Main {
	private class Time{
		int start,end;
		public Time(int start,int end) {
			this.start=start;
			this.end=end;
		}
	}
	public void swap(Time[] arr,int a,int b) {
		Time temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
public void score() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int n=sc.nextInt();
		if(n==0) {
			break;
		}
		Time[] arr=new Time[n];
		for(int i=0;i<n;i++) {
			int start=sc.nextInt();
			int end=sc.nextInt();
			arr[i]=new Time(start,end);
		}
		for(int i=0;i<n;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j].end<arr[j-1].end) {
					swap(arr,j,j-1);
				}
			}
		}
		int count=1,now=arr[0].end;
		for(int i=1;i<n;i++) {
			if(arr[i].start>=now) {
				count++;
				now=arr[i].end;
			}
		}
		System.out.println(count);
	}
}

public  static void main(String[] args) {
Main ma=new Main();
ma.score();

} 
}