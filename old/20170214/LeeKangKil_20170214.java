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
				[2017.02.14 ������ ����]
				0~9������ ���ڷ� �� ���ڸ� �Է� �޾��� ��, 
				�� �Է� ���� 0~9������ ���ڰ� ���� �� �� ���� ���� ������ Ȯ���ϴ� �Լ��� ���Ͻÿ�.
				[����]
				������ ������ �ٲ� �� ����.
				��, 0~9������ ���ڰ� ��� ���ԵǾ�� ��.
				[��� ����]
				�Է� : 0123456789 01234 01234567890 6789012345 012322456789
				��� : true false false true false
				���� ������ ������ ����Բ� ��Ź�帳�ϴ�.
		 */
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		int result[] = new int[10];


		try{
			String strInput[] = (in.readLine()).split(" "); // ���� �и�
			
			for (int i=0;i<strInput.length; i++){
				String value = strInput[i];
				Boolean checkFlag = true;
				
				for (int k=0; k<result.length; k++) { // �ʱ�ȭ
					result[k]=0;
				}
				
				for(int j=0; j<value.length();j++){
					int idx = Integer.parseInt(String.valueOf(value.charAt(j)));
					result[idx] ++;
				}
				
				for(int w=0; w<result.length;w++){
					if(result[w] != 1) { 
						checkFlag=false;
					}
				}
				
				System.out.print(checkFlag + " " );
			
			}
			
			
			
		}catch (IOException e){
			
		}
	
	}
	

}
