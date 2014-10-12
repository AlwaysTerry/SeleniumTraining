package practicefour;

public class StaticDemo {

	static String v1 = "m";
	
	static{
		System.out.println("This is static block!");
	}
	
	public StaticDemo(){
		System.out.println("This is constructor!");
	}
	
	public static void getStaticMethod(){
		System.out.println(v1);
	}
	
	
	public static  class InnerClazz{
		public InnerClazz(){
			System.out.println("This is an inner class to get parameters v1:"+v1);
		}
	}
	
	public static void main(String[] args){
		///scenario1
		StaticDemo a = new StaticDemo();
		a.v1="n";
		System.out.println(a.v1);
		
		StaticDemo b = new StaticDemo();		
		System.out.println(b.v1);
		
		
		///scenario2
		InnerClazz in = new StaticDemo.InnerClazz();
		
	}
	
	
	
	
}
