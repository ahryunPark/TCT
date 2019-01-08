/*
 � �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ��������.

���� ���

d(91) = 9 + 1 + 91 = 101
�� ��, n�� d(n)�� ���׷�����(generator)��� �Ѵ�. ���� ������ 91�� 101�� ���׷������̴�.

� ���ڵ��� �ϳ� �̻��� ���׷����͸� ������ �ִµ�, 101�� ���׷����ʹ� 91 �� �ƴ϶� 100�� �ִ�. �׷��� �ݴ��, ���׷����Ͱ� ���� ���ڵ鵵 ������, �̷� ���ڸ� �ε��� ������ Kaprekar�� ���� �ѹ�(self-number)�� �̸� �ٿ���. ���� ��� 1,3,5,7,9,20,31 �� ���� �ѹ� ���̴�.

1 �̻��̰� 5000 ���� ���� ��� ���� �ѹ����� ���� ���϶�.
 */

import java.util.ArrayList;

public class Kimsiwon_20170213 {
//	private static ArrayList<Integer> numberGenerator;
	
	public static void main( String[] args ) {	
		
		int inputNumber = 5000;
		
		int resultValue = run(inputNumber);
		
		System.out.println("Total: " + resultValue);
    }
	
	public static int run(int Input){
		
		ArrayList<Integer> numberGenerator = new ArrayList<Integer>();
		int currentSum;
		int resultSum;
		
		for (int i = 0; i < Input; i++){
			String currentNumber = String.valueOf(i);
			currentSum = 0;
			
			for (int j = 0; j < currentNumber.length(); j++){
				currentSum = currentSum + Integer.parseInt(currentNumber.substring(j, j+1));
			}
			
			numberGenerator.add(currentSum + i);					
		}
		
		resultSum = 0;
		
		for (int i = 0; i < Input; i++){
			if(!numberGenerator.contains(i)){
				resultSum = resultSum + i;
				System.out.println("i: " + i);
			}			
		}
		
		return resultSum;
		
	}

}
