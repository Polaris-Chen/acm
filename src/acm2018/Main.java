package acm2018;//���ı��˵Ĵ���
import java.util.Scanner;//������ѧ��

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long[] a = new long[54];//�������long����Ϊ0<n<54�����Զ���һ������Ϊ54�����顣
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		a[4] = 4;
		for (int i = 5; i < 54; i++) {
			a[i] = a[i - 1] + a[i - 3];//�ҹ��ɣ�ǰ����һֱ������ţ�����ޣ��������꿪ʼ������ţ��ʼ���ܣ����n���ţ����Ϊ��n-1���ţ���������ϵ�n-3�����ţ��������
		}
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;//��n==0ʱ��������
			}
			System.out.println(a[n]);//�����n���ţ������
		}

	}

}
