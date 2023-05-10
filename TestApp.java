class Test{
	static{
		System.out.println("Test: static Block");
	}
	public Test(){
		System.out.println("Test: 0 param constuctor");
	}
}

class Demo{
	static{
		System.out.println("Demo: static Block");
	}
	public Demo(){
		System.out.println("Demo: 0 param constuctor");
	}
}
public class TestApp{
	public static void main(String[] args){
		Demo d1= new Demo();
		Demo d2= new Demo();
		Demo d3= new Demo();
	}
	
}