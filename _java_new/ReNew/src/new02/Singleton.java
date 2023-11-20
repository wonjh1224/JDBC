package new02;

public class Singleton {

	public static void main(String[] args) {
		// �̱��� ���� : ������ ���� �� �ϳ�
		// ��ü�� 1���� �����Ͽ� �����ϰ��� �� �� ���
//		Single s = new Single(); ���� X
		Single s = Single.getInstance();
		Single s2 = Single.getInstance();
		
		System.out.println(s);
		System.out.println(s2);

		if(s == s2) {
			System.out.println("s�� s2�� ���� ��ü");
		}else {
			System.out.println("�ٸ� ��ü");
		}
	}

}

class Single{
	// ��ü�� 1���� �����Ͽ� �����ϰ��� �� �� ���
	private static Single instance;
	
	//�����ڸ� ���� ��ü ������ �������� �����ڸ� private ����
	private Single() {}
	
	//getInstance() �޼��带 ����Ͽ� instance�� �������� �ʾҴٸ�
	//�����ؼ� ����, �ƴϸ� ���� �ν��Ͻ��� ����
	public static Single getInstance() {
		if(instance==null) { 
			instance = new Single();
		}
		
		return instance;
	}
	
}
