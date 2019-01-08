package com.lgcns.lkk;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main (String arg[]) throws IOException  {
		run();
	}

	static void run(){
		/*
		[2017.02.02 ������ ����]
		���� : �߱����� 
		��ǻ�Ͱ� ������ ������ ���� 3���� �Է¹��� ���� 3���� ���Ͽ� Strike, Ball ����� ����մϴ�.
		3�� ���ڸ� ��� ���߸� strike out ���� ���� ����!!
		[����]
		��ǻ�Ͱ� ������ ������ ���� 3���� ���� �ߺ��Ǹ� �ȵ˴ϴ�.
		�Է¹޴� ���� 3���� ����, ��ǻ�Ͱ� ������ ������ ���ڿ� "�ڸ���, ���ڰ� ������ ��Ʈ����ũ" "���ڰ� ���� �ڸ����� �ٸ��� ��" �� ����մϴ�.
		��ǻ�Ͱ� ������ ������ ���ڿ� �Է¹޴� ���ڰ� ��ġ�ϸ� ������ ����Ǹ� �õ�Ƚ���� �Բ� �������� �޽����� ����մϴ�.
		[��� ���� > ��ǻ�Ͱ� ������ ������ ���� 4 5 1 �� ���]
		3 �� ���ڸ� �Է��ϼ���
		1
		4
		6
		0 Strike 2 Ball
		3 �� ���ڸ� �Է��ϼ���
		4
		1
		6
		1 Strike 1 Ball
		3 �� ���ڸ� �Է��ϼ���
		4
		1
		5
		1 Strike 2 Ball
		3 �� ���ڸ� �Է��ϼ���
		4
		5
		1
		3 Strike 0 Ball
		4 ȸ���� Strike Out!!!
		 */
		int idx=0;
		int comNum[] = new int[3];
		int str = 0;
		int ball = 0;
		int tryCnt=0;
		
		while(idx<comNum.length){
			
			boolean checkDup = false;
			int rndNum = (int) (Math.round(Math.random()*10)%9);
			
			for(int i=0;i<idx+1;i++)
			{
				if(	comNum[i] == rndNum ){
					checkDup=true;
				}
			}
			if(!checkDup) comNum[idx++] = rndNum; 
		}
		
		for(int j=0; j<comNum.length; j++){
			System.out.print(comNum[j] + " " );
		}
		
		while(true){
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader in = new BufferedReader(isr);
				try{
							int intInput[] = new int[comNum.length];
							
							for(int i=0;i<intInput.length;i++){
								intInput[i] = Integer.parseInt(in.readLine()) ;
							}
							
							for(int i=0; i<comNum.length; i++){
								int temp = comNum[i];
								for(int j=0; j<intInput.length;j++){
									if (intInput[j] == temp){
										if(i==j) str++;
									  else  ball++;
									}
								}
							}

							tryCnt++;
							System.out.println(str + " strike " + ball + " ball");
							if(str == 3) { 
								System.out.println( tryCnt + " ȸ���� Strike Out"  ); 
								break;
							} 
				}catch(IOException e){
			}
		}		
	}
}
