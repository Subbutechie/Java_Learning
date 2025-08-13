package example;

public class bhavan {
	
	private String name = "Mll";
	private  int age;
	
	protected String hobby = "giching";
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static int add(int a) {
		return a;
	}
	
	public static int add(int a ,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println(add(1));
		System.out.println(add(1,2));
	}
	
	
	
}
