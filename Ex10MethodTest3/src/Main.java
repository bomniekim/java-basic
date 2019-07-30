
public class Main {

	public static void main(String[] args) {

		int a = 10;
		int b = 4;

		// ��Ģ������ ���ִ� ���� ��ü ����(�޼ҵ常 �ִ� Ŭ����)
		Calculator cal = new Calculator();

		int sum = cal.sum(a, b);
		System.out.println(sum);

		int sub = cal.subtract(a, b);
		System.out.println(sub);

		int mul = cal.multi(a, b);
		System.out.println(mul);

		int div = cal.divide(a, b);
		System.out.println(div);

		// �Ǽ��� ���ڵ��� ��Ģ���� �Ƿ�
		double c = 3.5;
		double d = 4.6;

		System.out.println(cal.sum(c, d));
		System.out.println(cal.subtract(c, d));
		System.out.println(cal.multi(c, d));
		System.out.println(cal.divide(c, d));

		// ���Ѵٸ� ���ڿ� �������� ��� ���� ��ɵ� ���� �� ����.
		System.out.println("123" + "456"); // 123456
		System.out.println(cal.sum("123", "456"));// int�� ���� = 579

		// call by value, call by reference
		int n = 10;
		
		
		Cal ca = new Cal();
		// ������ ���� 1 ������Ű�� ����� ����
		ca.increase(n); // call by value : 11
		//������ n�� ���� �״�� 10
		//���� ���ư��� 10+1 x=11
		System.out.println("main�� n��: "+n); // 10 ���� ���ư��� ���ڰ� ���ư����� �ƴ�
		

		
		int[] arr = new int[] {10,20,30}; 
		ca.increase(arr);
		System.out.print("main�� arr��: ");
		
		//for(int i=0; i<arr.length; i++) {
		//int t= arr[i];
		
		for(int t : arr) { //for each��
			System.out.print(t+"  ");
		}
		System.out.println();
			
		
		//������ ������ ���� �˾ƺ���
		//��������, �������, �Ű�����, ��������
		//Variable.java���� ����� �׽�Ʈ

		
		
		
	}// main method

}// Main class



class Cal {

	// ���޹��� ���� 1������Ű�� ����� ���� Ŭ����
	void increase(int x) {
		x++;
		System.out.println("x�� ��: "+x);
	}
	
	//�迭�� �Ķ���ͷ� �޴� �޼ҵ�(�Ű������� �迭�������� ���)
	//call by reference
	//�迭��Ұ��� 1�� ������Ű�� ����� ���� �޼ҵ�
	void increase(int[] a) {
		//��Ұ� 1�� ����
		for(int i=0; i<a.length; i++) {
			a[i]++;
			System.out.print(a[i]+"  ");
		}
		System.out.println();
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	