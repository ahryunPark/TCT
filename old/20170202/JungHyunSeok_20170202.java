package com.lgcns.LCP01;

import java.util.Scanner;

public class JungHyunSeok_20170202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[3];
		int[] b = new int[3];
		int[] result = new int[10];
		int cnt = 0;
		boolean bool = false;
		
		for(int i=0; i<a.length;++i){
			do{
				bool = false;
				a[i] = (int)(Math.random() * 10);
				
				for(int j=0; j<i;++j){
					if(a[i] == a[j]){
						bool = true;
					}
				}
				
			}while(bool);
		}
		
		while(true){
			int strike =0;
			int ball =0;
			System.out.println("3�� ���� �Է�");
			
			for(int i=0; i<b.length;++i){
				b[i] = scan.nextInt();
			}
			
			for(int i=0; i<b.length;++i){
				for(int j=0; i<b.length;++j){
					if(b[i] == a[j]){
						if(i == j){
							strike++;
						}else{
							ball++;
						}
					}
				}
			}
			System.out.println( strike + " Strike," + ball + " Ball");
			cnt++;
			
			if(strike ==3){
				break;
			}
			
		}
		
		System.out.println(cnt +"ȸ���� Strike Out!!!");
		
	}

}
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

