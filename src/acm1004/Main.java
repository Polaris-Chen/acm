package acm1004;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
				while(sc.hasNext()) {
			int nums=sc.nextInt();
			if(nums==0) 
				break;
			nums++;
			String[] s=new String[nums];
			
		
			int maxnums=-1;
			int maxpos=0;
			 for(int j=0;j<nums;j++) {
				 s[j]=sc.nextLine();/*nextLine()���������س��������
				 ���س�ǰ���������ݴ������,���������ڶ���ʱ,��������ɫ ����س�
				 ϵͳ���س�ǰ�������ַ�����,�����˻س�,���һ��ʱ�Ͱѻس���������,
				 ֱ�ӽ���,������Ҫ�����������һ����,��ѭ��һ��,�����һ�θ���λ��
				                     
				                     
          next�������ܵõ������ַ�()�ո�,�س�,tab���ַ�����
				 */
				 int max=0;
				 for(int k=0;k<j;k++) {
					//max=0 ������������max��λ�ô��� ����ֻ�������һ���ظ�����ɫ
					 if(s[j].equals(s[k])){
						 max++;
					 }
					if(max>maxnums) {
						maxnums=max;
						maxpos=j;
					}
				 }
			 }
		System.out.println(s[maxpos]);	 
		}
	sc.close();			}
	
	//Accepted
	}


