package acm1007_wrong;
import java.util.*;//time超过
//import java.math.*;
import java.text.DecimalFormat;
public class Main {
	DecimalFormat df1=new DecimalFormat("#0.00");
	Scanner sc=new Scanner(System.in);
public void q() {
	float min=1f/0f;
	while(sc.hasNextLine()) {
		int s=sc.nextInt();
	float[][]	nums=new float[s][2];
	for(int i=0;i<s;i++) {
	if(i==0) {sc.nextLine();}//这里天秀
		//String temp=sc.nextLine();
	
		String arr[]=sc.nextLine().split("\\s+");
		for(int w=0;w<2;w++) {
				
		nums[i][w]=Float.parseFloat((arr[w]));
			}
	}
	float distance=0f/1f;
	for(int k=0;k<s;k++) {
		for(int q=0;q<k;q++) {
			float x=nums[q][0]-nums[k][0];
			float y=nums[q][1]-nums[k][1];
			distance=(float)(Math.pow(x, 2)+Math.pow(y, 2));
			if(distance==0) {
				min=0;
				break;}
			if(distance<min) {
			 min=distance;
			 }
		 
		}
	}


	System.out.println(df1.format(Math.pow(min,0.5)/2));
	
	}

}

	public static void main(String args[]) {
	Main a=new Main();
	a.q();

	}

}
