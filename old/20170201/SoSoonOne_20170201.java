package com.test02;

public class SoSoonOne_20170201 {
/*
	[2017.02.01 ������ ����]
			����: �ֻ��� ����
			�� ���� �ֻ����� ���� ���� �ջ�, ����մϴ�.

			[����]

			    ��� �Լ��� �̿��� �������ּ���.
			    ��, �� �ֻ����� ���� ���� ��� �ѹ� �� �����ϴ�.
			    �ֻ��� ���� 1~6 ���� ����

			[��� ����]
			3 3
			6 6
			5 4
			27 ��ŭ ����!
*/
			static int DiceGame() {
			    int dice1= 0, dice2 = 0;
			    int dice = 0;
			    
			    dice1 = (int) (Math.random()*6) + 1;
			    dice2 = (int) (Math.random()*6) + 1;
			    
			    dice = dice1+dice2;
			    System.out.println(dice1 + " " + dice2);
			    if(dice1 == dice2){
			    	return dice + DiceGame();
			    }
			    return dice;
			}

			public static void main(String[] args) {
			         System.out.println(DiceGame() + " ��ŭ ����!");
			}


}
