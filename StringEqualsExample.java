package chapter05;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		if(strVar1==strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		}
		
		else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		
		
		if(strVar3==strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		}
		
		else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		} 
		//���� strVa11�� strVar2ó�� ������ ���ڿ� ���ͷ��� String��ü�� �������� ��쿡�� ���ڿ� ��ü�� ���ϹǷ� ������ ����� true�� ��ȯ�ȴ�.
		//���⼭ else�� ��µǴ� ������, ��ü�� �����ϸ� ��ü�� �ش� �ּҸ� ���ϱ� ������ strVar3�� strVar4�� �ּҸ� �Ǻ��ϹǷ� ������ �ٸ��� ���´�. ���� false��ȯ
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}

	}

}
