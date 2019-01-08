package com.lgcns.lkk;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {

	public static void main (String arg[]) throws IOException  {
		run();
	}

	static void run(){
		/*
		���ĵ� ������ ������ �ִ� K ���� List�� �ֽ��ϴ�.
		�� List���� 1������ ���ڸ� �����Ͽ� ���� ���� ������ ����ϼ���.
		���� ��� 
		List 1: [4, 10, 15, 24, 26] 
		List 2: [0, 9, 12, 20] 
		List 3: [5, 18, 22, 30] 
		���� ������ ��°��� [20,24] �Դϴ�.
		List 1���� 24, List 2���� 20, List 3���� 22�� �������� ����Դϴ�.
		 */
	
		int list1[]={4,10,15,24,26};
		int list2[] = {0,9,12,20};
		int list3[] = {5,18,22,30};
		
		int r1=0;
		int r2=0;
		int r3 =0;
		int minlen =1000;
		
		for(int i=0; i<list1.length;i++){
			for( int j=0; j<list2.length; j++){
				for(int k=0; k<list3.length;k++){
					
					int a = list1[i];
					int b = list2[j];
					int c = list3[k];
					
					int len = Math.max(Math.max(a, b),c) -Math.min(Math.min(a, b),c);
					if (len < minlen ){
						minlen = len;
						r1 = i;
						r2 = j;
						r3 = k;
					}
					
				}
			}
		}
		int max = Math.max(Math.max(list1[r1], list2[r2]),list3[r3]);
		int min = Math.min(Math.min(list1[r1], list2[r2]),list3[r3]);
		System.out.println(min + "  " + max );
		
		
	}
	
	
}
