/**
 * ===========================================
 * Program ID : khr_test.java
 * ===========================================
 * Modify Date    Modifier    Description
 * -------------------------------------------
 * 2017. 1. 17.  hyeryoung.kim   Initial
 * ===========================================
 */

/**
 * @author hyeryoung.kim
 *
 */
public class KimHyeRyoung_20170117 {

	/**
	 * @param args
	 *  1. ���ڿ� ���� �˰��� (LCP ���⹮��)
			���ڿ��� �Է¹޾Ƽ�, ���� ���ڰ� ���������� �ݺ��Ǵ� ��쿡 �� �ݺ� Ƚ���� ǥ���Ͽ� ���ڿ��� �����ϱ�.
			��, �ѹ��� �ݺ��Ǵ� ���ڴ� ���� ����  �״�� ǥ���Ұ�

			�Է� ����: aaabbcccccca
			��� ����: a3b2c6a

			�Է� ����: abbcccccca
			��� ����: ab2c6a

			�Է� ����: apple
			��� ����: ap2le
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str = args.toString();
		String str = "apple";
		System.out.println("�Է°� : " + str);

		String chr = "";
		String[] arr = new String[str.length()];
		for ( int i = 0 ; i < str.length(); i++ ) {
			chr = str.substring(i, i+1);
			arr[i] = chr;
		}

		String result = "";
		int cnt = 1;
		for ( int j = 0 ; j < arr.length ; j++ ) {
			if ( j != arr.length -1 && arr[j+1].equals(arr[j]) ) {
				//result += arr[j].concat(String.valueOf(cnt));
				cnt++;
			} else {
				if ( cnt != 1 ) {
					result += arr[j] + String.valueOf(cnt);
					cnt = 1;
				} else {
					result += arr[j];
				}
			}
		}
		System.out.println("����� : " + result);
	}

}
