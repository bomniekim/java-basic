
public class Constructor {

	public static void main(String[] args) {
		
		Person p = new Person(); //멤버값들이 기본값으로 초기화
		//객체생성 후 언제나 멤버값 세팅하는 작업이 실행되는 것이 일반적
		
		//멤버변수가 private이기 때문에 외부에서 사용할 수 없음
		//따라서 멤버변수에 값을 대입하는 메소드를 호출해서 값을 전달하는 방식을 사용해야함
		p.setMembers("Sam", 20);
		
		//멤버값을 출력해주는 메소드를 호출
		p.show();
		
		
		//2번째 객체부터는 생성과 사용이 편함
		Person p2 = new Person();
		p2.setMembers("Robin", 21);
		p2.show();
		
		//이런 방식조차도 짜증! 왜? 
		//언제나 객체생성 후에 값 대입을 위해 또 다시 .setMembers() 메소드를 호출해야만 함
		
		
		//객체를 생성하면 반드시 이어서 메소드를 호출하는 작업이 필요한 경우가 많음
		
		//객체를 생성하면서 메소드를 이용해서 값 대입을 하고자 함.
		//객체가 생성될 때(new) 자동으로 호출되는 메소드가 있다면  좋을텐데..
		//이런 것을 생성자(constructor; 생성자 메소드)라고 함
		//new만 하면 자동으로 실행!
		
		//먼저, 생성자 메소드 연습을 위해 
		First f = new First();
		
		//생성자 메소드는 객체를 생성할 때 마다 호출됨.
		First f2 = new First();
		
		
		//생성자 메소드에 파라미터 전달
		First f3 = new First(10);
		
		
		//생성자를 Person클래스에 적용하기
		new Person();
		
		
		//생성자 메소드도 접근제한자의 영향을 받는다.
		//다른 패키지에 있는 클래스의 default 접근 제한자로 된 생성자 메소드를 호출하기
		//aaa.Test t=new aaa.Test(); //error - 다른 패키지의 default 접근제한자인 생성자는 호출할 수 없기 때문 
		//그래서 가급적 생성자는 public으로 하는 습관으로 가질 것
		 
		
		
		//Person클래스의 생성자도 public으로 변경..
		Person p3= new Person();
		p3.show();
		
		//생성자에 파라미터를 전달(초기화: 객체를 생성(new))
		Person p4 = new Person("Hong", 30);
		p4.show();
		
		
		//이름만 먼저 초기화하고 싶은 경우도 있을 수 있음.
		Person p5 = new Person("Kim");
		//나이만 먼저 초기화하고 싶은 경우도 있을 수 있음.
		Person p6 = new Person(31);
		
		
		
		//일반메소드에서 다른 메소드를 호출할 수 있듯이
		//this().. 하나의 생성자 메소드에서 다른 생성자 메소드를 호출하는 기법!
		Second s1 = new Second (50,30);
		
		//객체를 생성하면서 멤버값을 초기화하지 않을 수도 있음
		Second s2 = new Second();
		
		//하나의 값만을 줄 수도 있음
		Second s3 = new Second(10);

		
		
		
		
		//자바의 초기화 기법
		//실제 멤버변수에 여러단계를 거쳐 초기화 됨.
		InitialTest obj = new InitialTest();
		System.out.println( obj.a );
		
		new InitialTest();
		new InitialTest();
		
	}

}
//Static (정적): 이미 메모리에 박혀있다.











