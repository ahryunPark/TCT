import java.util.*;

public class SangyunYi_170117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
���ڿ� ���� �˰��� (LCP ���⹮��)
���ڿ��� �Է¹޾Ƽ�, ���� ���ڰ� ���������� �ݺ��Ǵ� ��쿡 �� �ݺ� Ƚ���� ǥ���Ͽ� ���ڿ��� �����ϱ�.
��, �ѹ��� �ݺ��Ǵ� ���ڴ� ���� ����  �״�� ǥ���Ұ� 
�Է� ����: aaabbcccccca
��� ����: a3b2c6a
�Է� ����: abbcccccca
��� ����: ab2c6a
�Է� ����: apple
��� ����: ap2le
		 */
		Scanner in = new Scanner(System.in); 
		System.out.print("�Է� ����:  "); 
		String str = in.nextLine();
		char[] cInput = new char[str.length()];
		char kk = 'c';
		int c=0;
		String result = "";
		for(int i=0; i<str.length(); i++){
			cInput[i] = str.charAt(i);
		}
		
		for(int j=0; j<str.length(); j++){
			if(j>0){
				if(cInput[j-1]==cInput[j]){
					kk = cInput[j];
					c++;
				}else{
					result += new Character(kk).toString()+c;
					c=0;
				}
			}else{
				kk = cInput[j];
				c++;
			}
		}
		System.out.println("��� ����: "+result);
		in.close();
	}

}
