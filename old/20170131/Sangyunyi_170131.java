/*
����: �������� ���� 1���� �Ұ��ó� ����ϱ�
�Ұ��� Rule
 1) 101���� �Ұ��ó���� O ������� �ձ۰� �ɴ´�. 
 2) ù��° �Ұ��ó���� �ð�������� ��ȭ�� �Ѵ�.
 3) ��ȭ�� ���� �Ұ��ó�� Yes �Ǵ� No �� �� �� �ִ�. 
 4) NO �� ������ �Ұ��ó�� �ڸ��� ���� ������ ����, Yes ��� �� �Ұ��ó�� �ڸ��� ���´�.
 5) ���� 1���� �Ұ��óุ ���� ������ ��� �ð�������� ���� ��ȭ�� �Ѵ�.
�������� 
  1) Ȧ����° ��ȭ�� ���� �Ұ��ó�� Yes�� �ϰ�, ¦����° ��ȭ�� ���� �Ұ��ó�� No�� �Ѵ�.
ù��° �Ұ��ó�� Yes, �ι�° �Ұ��ó�� No , ����° �Ұ��ó�� Yes
 */
import java.util.ArrayList;
import java.util.HashMap;
public class Sangyunyi_170131 {

	public static void main(String[] args) {

		ArrayList<String> sGirls= new ArrayList<String>();
		for(int i=0; i<101; i++)	
			sGirls.add(i, Integer.toString(i+1) );

		int iConversationCount=1;
		int iFlag=0;

		while(1==1){
			if(iConversationCount%2!=0){//Ȧ����
				iConversationCount++;
				iFlag++;
			}else{
				sGirls.remove(iFlag);
				iConversationCount++;
			}
			if( sGirls.size()==1){
				System.out.println(sGirls.get(0)+"��° �ʷ� ���ߴ�.");
				break;
			}else if(sGirls.size()==iFlag){
				iFlag=0;
			}
		}

	}

}
