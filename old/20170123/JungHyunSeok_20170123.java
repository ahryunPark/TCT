package com.lgcns.LCP01;

public class JungHyunSeok_20170123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JungHyunSeok_20170123 aa = new JungHyunSeok_20170123();
		System.out.println(aa.isTrue(142857));

	}
	
	public boolean isTrue(int num){
		int a = 0;
		int b = num;
		
		if(num/10 == 0){
			return true;
		}else{
			while(true){
				while(b >= 1){
					a += b % 10;
					b /= 10;
				}
				a += b;
				break;
			}
		}
		
		if(num % a == 0){
			return true;
		}else{
			return false;
		}
	}

}

/*[2017.01.23 ������ ����]
���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�. 
������� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�.
�Է¹��� ���� ���� n�� �ϻ�������� �ƴ��� �Ǵ��ϴ� �Լ��� �ϼ��ϼ���.
������� n�� 10, 12, 18, 153, 142857.. �̸� True�� ���� 11, 13..�̸� False�� �����ϸ� �˴ϴ�.
*/
