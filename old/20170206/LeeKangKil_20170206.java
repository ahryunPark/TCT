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
		1) 1~45 ������ �ߺ����� �ʴ� ������ ���� 6���� �����Ͽ� ���
		2) ������ 6���� ������ �������� Sorting�Ͽ� ���
		[����]
		��, ���� 6���� ���� ������ ��.
		[��� ����]
		������ ���� : 23 45 7 12 38 9
		���� ��� : 7 9 12 23 38 45
		 */
		int idx=0;
		int createNum[] = new int[6];
		int str = 0;
		int ball = 0;
		int tryCnt=0;
		
		while(idx<createNum.length){
			
			boolean checkDup = false;
			int rndNum = (int) (Math.round(Math.random()*100)%45+1);
			
			for(int i=0;i<idx+1;i++)
			{
				if(	createNum[i] == rndNum ){
					checkDup=true;
				}
			}
			if(!checkDup) createNum[idx++] = rndNum; 
		}
		
		System.out.print("������ ���� : ");
		for(int j=0; j<createNum.length; j++){
			System.out.print(createNum[j] + " " );
		}
		
		for(int i=0; i<createNum.length;i++)
		{
			for(int j=0;j<createNum.length-i-1;j++){
				
				if(createNum[j] > createNum[j+1]){
					int temp = createNum[j];
					createNum[j]= createNum[j+1];
					createNum[j+1] = temp;
				}
				
			}
		}
		
		System.out.print("\n���İ�� : ");
		for(int j=0; j<createNum.length; j++){
			System.out.print(createNum[j] + " " );
		}
		
		/*
		while(true){
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader in = new BufferedReader(isr);
				
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
							*/
				
		
	}
}
