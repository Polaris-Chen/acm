package acm2019;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
public void sort1() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int n=sc.nextInt();
		int x=sc.nextInt();
		if(n==0&&x==0) {
			break;
		}
		int[] arr=new int[n+1];
		arr[n]=x;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//Arrays.sort(arr);
		mergesort(arr);
		for(int j=0;j<n+1;j++) {
			if(j==0) {
			System.out.print(arr[j]);
			}
			else System.out.print(" "+arr[j]);
		}
		System.out.println();
	}
}


public void mergesort(int[] arr) {//������
	int L=0;
	int R=arr.length-1;

	aux_mergesort(arr,L,R);
	
}
private void aux_mergesort(int[] arr,int L,int R) {
	int mid=(L+R)/2;
	if(L>=R) {return;}
	aux_mergesort(arr,L,mid);
	aux_mergesort(arr,mid+1,R);
	if(arr[mid]>arr[mid+1]) {
	merge(arr,L,mid,R);}//�����ߵ����С���ұߵ���С,�ǾͲ���Ҫ����,��ԭ�����������������,��һ��
	//���Դ������Ч��
	
}
private void merge(int[] arr,int L,int mid,int R) {//�鲢����
	int[] auxarr=new int[R-L+1];//��������
		for(int q=L;q<R+1;q++) {
			auxarr[q-L]=arr[q];
		}//��������
		int i=L;
		int j=mid+1;
	for(int k=L;k<R+1;k++) {//�ж�ԭ����ĵ�k��λ�÷��ĸ�
		if(i>mid) {//�ж��Ƿ񳬹����
		arr[k]=auxarr[j-L];
		j++;
	    }
		else if(R<j) {
			arr[k]=auxarr[i-L];
			i++;
		}
		else if(auxarr[i-L]<auxarr[j-L]) {//˭��˭��arr[k]
			arr[k]=auxarr[i-L];
		i++;
		}
		else {
			arr[k]=auxarr[j-L];
			j++;
		}
	}
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.sort1();
	}

}
