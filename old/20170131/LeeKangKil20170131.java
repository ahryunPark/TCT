package com.lgcns.lkk;

import java.io.IOException;
import java.util.ArrayList;

public class Test {

	public static void main (String arg[]) throws IOException  {
		run();
	}

	public  static void run(){
		/*
			[2017.01.31 ������ ����]
		����: �������� ���� 1���� �Ұ��ó� ����ϱ�
		�Ұ��� Rule
		 1) 101���� �Ұ��ó���� O ������� �ձ۰� �ɴ´�. 
		 2) ù��° �Ұ��ó���� �ð�������� ��ȭ�� �Ѵ�.
		 3) ��ȭ�� ���� �Ұ��ó�� Yes �Ǵ� No �� �� �� �ִ�. 
		 4) NO �� ������ �Ұ��ó�� �ڸ��� ���� ������ ����, Yes ��� �� �Ұ��ó�� �ڸ��� ���´�.
		 5) ���� 1���� �Ұ��óุ ���� ������ ��� �ð�������� ���� ��ȭ�� �Ѵ�.
		�������� 
		  1) Ȧ����° ��ȭ�� ���� �Ұ��ó�� Yes�� �ϰ�, ¦����° ��ȭ�� ���� �Ұ��ó�� No�� �Ѵ�.
		ù��° �Ұ��ó�� Yes, �ι�° �Ұ��ó�� No , ����° �Ұ��ó�� Yes
		 */
		 ArrayList <Integer> arr = new ArrayList<Integer>();
		 int max = 101;
		 int idx=0;
		 int flag = -1;

		for(int i=1; i<max+1;i++){
			arr.add(i);
		}
		
		while(arr.size()>1){
			if(flag==1)  arr.remove(idx) ;
			else idx++;
			
			idx%=arr.size();
			flag*=-1;
			
		}

		System.out.println(arr.get(0));
	}

}
