package acm1003;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();

		for(int i=1;i<T+1;i++){
		 
			int nums=sc.nextInt();//�������
			if(nums==1) {//��ֻ��һ��ֱ�����
				int w=sc.nextInt();
				System.out.println("Case "+i+":");
				System.out.println(w+" 1 1");
			
				if(i!=T) {
					System.out.println();
					
				}
				continue;
				
			}//if  
				int[] list=new int[nums];//��������
			
				int sum = 0;
				int max = -1001;
				int start = 0;
				int end = 0;
				int temp = 1;
				
				for (int j=0;j<nums;j++) {
					list[j] = sc.nextInt();
					sum += list[j];
					
					if (sum>max) {
						max = sum;
						start = temp;
						end = j+1;
					}
					
					if (sum < 0) {
						sum = 0;
						temp = j+2;
					}
					
				}//��Ҫ���ñ�Ĵ������޲�����©�� ������������㷨
			//����Ĵ�����Ƿ��©��
  
            	
          
			
			System.out.println("Case "+i+":");
		
			System.out.println(max+" "+start+" "+end);
		
			if(i!=T) {
				System.out.println();
			}
				
			
			}//Accepted
		sc.close();
		}
		}/*
		
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();

		for(int i=1;i<T+1;i++){
		 
			int nums=sc.nextInt();//�������
			if(nums==1) {//��ֻ��һ��ֱ�����
				int w=sc.nextInt();
				System.out.println("Case "+i+":");
				System.out.print(w+" 1 1");
			
				if(i!=T) {
					System.out.println();
					
				}
				continue;
				
			}//if  
				int[] list=new int[nums];//��������
			
			int sum=0;
			int max=0;
			int positionEnd=1;
			int positionStart=1;
		
			for(int k=0;k<nums;k++) {
				list[k] = sc.nextInt();
				sum+=list[k];
				if(sum<0) {
					sum=0;
					positionStart=k+2;	
				}
				if(sum>max) {
					max=sum;
					positionEnd=k+1;
			
				}
			}
			if(positionStart>positionEnd) {
				
			max=list[0];
			positionStart=positionEnd=1;
            for(int r=1;r<list.length;r++) {
            		
            	if(list[r]>max) {
            		max=list[r];
            		positionStart=positionEnd=r+1;
            	
            }
            	
          }
			}
			System.out.println("Case "+i+":");
			System.out.print(max);
			System.out.print(" "+positionStart+" "+positionEnd);
		
			if(i!=T) {
				System.out.println();
			}
				
			
			}
		
		}
		}
*/