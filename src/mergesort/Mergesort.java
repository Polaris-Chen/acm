package mergesort;

public class Mergesort {//��������
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
public void mergesort(int[] arr) {//������
	int L=0;
	int R=arr.length-1;

	aux_mergesort(arr,L,R);
	for(int j=0;j<arr.length;j++) {
		System.out.println(arr[j]);
	}
}

}
