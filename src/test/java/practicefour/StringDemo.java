package practicefour;

public class StringDemo {

	public static void main(String[] args){
		String a ="a";
		String b = new String("abc");
		
		//////////////////
		StringBuffer sb1 = new StringBuffer("abc");
		sb1.append("edf");
		System.out.println(sb1.toString());
		
		sb1.delete(0, sb1.capacity());
		System.out.println("To delete the parameter content of stringbuffer: "+sb1.toString());
		
		///////////////////
		StringBuilder sb2 = new StringBuilder("abc");
		sb2.append("edf");
		System.out.println(sb2.toString());
		
		sb2.delete(0, sb2.capacity());
		System.out.println("To delete the parameter content of stringbuilder: "+sb2.toString());
	
		
		
	}
	
	
	
}
