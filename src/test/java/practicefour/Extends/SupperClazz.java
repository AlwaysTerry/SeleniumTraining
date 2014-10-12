package practicefour.Extends;

public class SupperClazz {

	static String a = "supper-a";
	
	static{
		System.out.println("This is supper clazz--"+a);
	}
	
	public SupperClazz(String t){
		System.out.println("This is supperclass constructor");
	}
	
	public void getAge(){
		System.out.println("My age is 30");
	}
}
