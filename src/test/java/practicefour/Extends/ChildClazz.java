package practicefour.Extends;

public class ChildClazz extends SupperClazz{

    static String a = "child-a";
	
	static{
		System.out.println("This is child clazz--"+a);
	}
	
	
	
	public ChildClazz(String t) {		
		super(t);
		System.out.println("This is childclass constructor");
		
		// TODO Auto-generated constructor stub
	}

	public void getAge(){
		System.out.println("My age is 31");
	}
	public void getName(){
		
	}
	
	public static void main(String[] args){
	    	SupperClazz sc = new ChildClazz("test");
	    	/*sc.getAge();
	    	
	    	boolean tr = sc instanceof SupperClazz;
	    	System.out.println(tr);*/
	}
	
	
	
}
