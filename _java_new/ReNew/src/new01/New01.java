package new01;

public class New01 {

	public static void main(String[] args) {

		/*
		 * ȫ�浿 �ֹε�Ϲ�ȣ�� 881122-1234567 ������� => ������� : 881122, ���� : ��(1,3) ��(2,4)
		 * 
		 */

		String hong = "881122-1234567";
		String sex = hong.substring(hong.indexOf("-") + 1, hong.indexOf("-") + 2);
		
		
		System.out.println("�������:" + hong.substring(0, hong.indexOf("-")));

		if(sex.equals("1") || sex.equals("3")){
			System.out.println("����:" + "��");
		}else{
			System.out.println("����:" + "��");
		}


		
			
		
	
		
	}

}
