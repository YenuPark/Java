package chapter05;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("���� : "+ sum1);
		
		int sum2 = add(new int[] {83, 90, 87}); 
		//���� add(new int[] {83, 90, 87}); ��ſ� add(scores)�� �����ϸ� ������ �߻��Ѵ�
		//�� ������ �޼ҵ��� �Ű����� ������ ��쿡�� �ݵ�� new�����ڸ� ����ؾ��Ѵ�.
		System.out.println("���� : " + sum2);
		System.out.println();

	}
	
	public static int add(int[] scores) {
		
		int sum=0;
		for(int i=0; i<3; i++) {
			sum+= scores[i];
		}
		
		return sum;
	}

}
