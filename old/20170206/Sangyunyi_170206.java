import java.util.Random;
import java.util.Scanner;

/*
����: �ζ�!!! ���纾�ô�~
1) 1~45 ������ �ߺ����� �ʴ� ������ ���� 6���� �����Ͽ� ���
2) ������ 6���� ������ �������� Sorting�Ͽ� ���
[����]
��, ���� 6���� ���� ������ ��.
[��� ����]
������ ���� : 23 45 7 12 38 9
���� ��� : 7 9 12 23 38 45
�̹��� ����� ����� �ֽô� �в��� ��ǰ��.... ^^
������... ������ �����մϴ�.  �׸���, ���� ������ ������ ������� �� �ֽðڽ��ϴ�.
 */


public class Sangyunyi_170206 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iRandom = Random();
		System.out.println("������ ���� : "+iRandom[0]+" "+iRandom[1]+" "+iRandom[2]+
				           " "+iRandom[4]+" "+iRandom[5]);
		Sorting(iRandom);
		System.out.println("���� ��� : "+iRandom[0]+" "+iRandom[1]+" "+iRandom[2]+
		           " "+iRandom[4]+" "+iRandom[5]);
	}
	public static int[] Sorting(int[] input){
		int a=0;
		while(1==1){
			a++;
			if(a<6){
				for(int i=0;i<5;i++){//0,1,2,3,4,5
					if(input[i]>input[i+1]){
						int iTemp = 0;
						iTemp = input[i];
						input[i] = input[i+1];
						input[i+1] = iTemp;
					}
				}
			}else{break;}
		}
		return input;
	}

	
	
	public static int[] Random(){
		Random random = new Random();
		int[] iRandom = new int[6];
		iRandom[0] = random.nextInt(45)+1;
		iRandom[1] = random.nextInt(45)+1;
		iRandom[2] = random.nextInt(45)+1;
		iRandom[3] = random.nextInt(45)+1;
		iRandom[4] = random.nextInt(45)+1;
		iRandom[5] = random.nextInt(45)+1;
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				if(i!=j && iRandom[i]==iRandom[j]){
					Random();
				}
			}
		}
		return iRandom;
	}
}


