
public class Variable {

	//�ڹٿ����� ������ ���� [ �������, ��������, �Ű�����, ����(static)���� ]
	
	//�������(Field) - class {} �ȿ� ����� ����
	//��������� ��ü�� ������ �� �������(new �ɶ�!) -> ��ü�� �Ҹ�� ��������� �ڵ��Ҹ�
	int a; //��������� ����⸸�ϸ� �ڵ� 0 �ʱ�ȭ
	int b;
	
	
	
	
	//�������� - �޼ҵ� �ȿ� ���� ����
	//���������� �޼ҵ尡 ȣ��� �� �޸𸮿� ������� -> �޼ҵ尡 ����Ǹ� �޸𸮿��� �Ҹ�
	void aaa() {
		
		int k; //�������� : �ڵ� �ʱ�ȭ���� ����
		
		System.out.println( a ); // 0
		//System.out.println( k ); //�����Ⱚ�� ��ºҰ��̹Ƿ� error
		
		c=50; //�ڡڡڸ�������� �޼ҵ尡 ����Ǳ� ���� ���� �����ϹǷ� error�� ���� �����ڡڡ�
		
		
		//�ٸ� �޼ҵ� ȣ�� ����
		bbb();
	}
	
	int c; //������� - ������ġ�� free
	
	
	
	//�ٸ� �޼ҵ�
	void bbb() {
		//��������� �� Ŭ���� �ȿ����� ��𼭵� �ν��� ����
		a=30;
		System.out.println( a ); //������� a ��� :30
		
		//aaa()�޼ҵ��� ���������� �ٸ� �޼ҵ忡���� �νĺҰ���
		//k=30; //error
		
		//��������� ���� �̸��� ���� �������� ����? YES!
		int a; //��������
		a=50; //��������
		
		System.out.println( a ); //�������� a ��� : 50
		
	}
	
	
	//�Ķ����(�Ű�����)�� ���������� ����
	void ccc(int x, int a) { //��������� ���� �̸��� ���� �Ű������� ����
		a=50; //�Ű����� a�� �ǹ�
		int k; //��������
	}
	
	
	void ddd() {
		
		aaa(); //�ٸ� �޼ҵ� ȣ�Ⱑ��
		
		ddd(); //���� �޼ҵ带 �ٽ� ȣ���� ���� ���� (���ȣ��:Recursive call)
	}
	
	
	
	//this Ű������ ����!
	void eee() {
		int a=5; //��������� ���� �̸��� ���� �������� ����
		System.out.println( a ); //�������� a ��� - 5
		
		//�� ��Ȳ���� ������� a�� ����ϰ� �ʹٸ�?
		//�̶� this Ű���� ���������� �̿�
		//thisŰ����� �� Ŭ������ ��ü�� �����ϰ� �ִ� Ư���� ������
		System.out.println( this.a ); //������� a��� - 0
		
		
	}
	
	
	int d; //���⿡�� ������� ���� ���� (Ŭ���� �ȿ���)
	
}//class

//Ŭ���� ���� ���� ������ �Ұ���!
//int e; //error - �ڹٿ��� ���������� �������� ����


// ��ü�� new�� �����ǰ� ��ü�� �� �̻� �ʿ���ٰ� �Ǵܵ� �� �ڵ��Ҹ� (null)
// �Ҹ�����ִ� ������ process ����(in JRE) : �����������(Garbage Collector:GC)
// ���α׷��� �����Ű�� ������ ��� ����
