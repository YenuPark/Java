package chapter06;

public class Car3 {
	
	String company = "�����ڵ���";
	String model;;
	String color;
	int maxSpeed;
	int speed;
	
	
	Car3(){
		
	}
	
	Car3(String model){
		this(model, "����", 250);
		//this()�� �ڽ��� �ٸ� �����ڸ� ȣ���ϴ� �ڵ�, �������� ù �ٿ����� ��� ����
		//model �Ű������� ã�� ���� �ٸ� Car ������ ã�Ƽ� ����
	}
	
	Car3(String model, String color){
		//model�� color �Ű������� ã�� ���� �ٸ� Car ������ ã�Ƽ� ����
		this(model, color, 250);
	}
	
	Car3(String model, String color, int maxSpeed){
		//��, ��� �����ڵ��� ���� ���� �ڵ�
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}

}
