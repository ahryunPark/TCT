/*
 100���� 1000 ������ ���� �� �� �ڸ����� �ش��ϴ� ������ ���� ���� �ش� ���ڿ� ������ ���ڸ� ����Ѵ�.
  ex) 153 = 1x1x1 + 5x5x5 + 3x3x3
= 1 + 125 + 27
[����]
1) Armstrong Number ����Ѵ�.
[������]
153
370
371
407
 */
public class Kimsiwon_20170119 {
	public static void main( String[] args ) {
		
		String tmpStr = "";
		int tmpLen = 0;
		int tmpSum = 0;
		int tmpNum = 0;
		
		for (int i = 100; i < 1000; i++){
			tmpStr = Integer.toString(i);
			tmpLen = tmpStr.length();
			tmpSum = 0;
					
			for (int j = 0; j < tmpLen; j++){
				tmpNum = Integer.parseInt(tmpStr.substring(j,j+1)); 
				tmpSum = tmpSum + tmpNum*tmpNum*tmpNum;				
			}
			
			if(i == tmpSum){
				System.out.println("Result: " + i);
			}
			
		}
		
    }

}
