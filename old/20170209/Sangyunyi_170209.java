/*
1���� 20���� ���ڰ� �ϳ��� ���� 20���� ī�尡 ������������ �� �ٷ� �����ִ�. 
�� ī���� ��ġ�� ī�� ���� ���� ���ڿ� ���� 1���� 20������ ��Ÿ����.
������ ���� ��Ģ���� ī���� ��ġ�� �ٲ۴�
���� [a,b] (��, 1��a��b��20) �� �־����� ��ġ a���� ��ġ b������ ī�带 ������ �������� ���´�.
���� ���, ������ [5,10]���� �־����ٸ�, ��ġ 5���� ��ġ 10������ ī�� 5,6,7,8,9,10�� ������ �� �Ͽ� 10,9,8,7,6,5�� ���´�. 
--> �׸����� : 1,2,3,4,10,9,8,7,6,5,11,12,13,14,15,16,17,18,19,20.
--> �׸�����.: 1,2,3,4,10,9,8,7,13,12,11,5,6,14,15,16,17,18,19,20
[��� ����(3�� ������ ���)]
�Է±��� :        
[3,7]
[4,6]
[5,5]
��� : ���� ī���ġ�� [1,2,7,4,5,6,3,8,9,10,11,12,13,14,15,16,17,18,19,20] �Դϴ�.
*/
public class Sangyunyi_170209 {
	
	public static void reverse(int[] param, int startIndex, int endIndex){
		if(startIndex>=endIndex){
		}else{
//[3,7] : 3-7, 4-6, 5... 2��
//[3,6] : 3-6, 4-5, 5... 2��
			int iTemp=0;
			int iIndex = (endIndex-startIndex+1)/2;
			for(int i=0; i<iIndex; i++){
				iTemp = param[startIndex+i];
				param[startIndex+i] = param[endIndex-i];
				param[endIndex-i] = iTemp;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = new int[21];
		for(int i=1; i<=20; i++){	
			inputArray[i] = i;
		}
		reverse(inputArray, 3, 7);
		reverse(inputArray, 4, 6);
		reverse(inputArray, 5, 5);
		System.out.print("��� : ���� ī���ġ�� [");
		for(int j=1; j<=20; j++){
			if(j<20)	System.out.print(inputArray[j]+",");
			if(j==20)	System.out.print(inputArray[j]+"");
		}
		System.out.print("] �Դϴ�.");
		
	}
}
