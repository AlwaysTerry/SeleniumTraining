package practicefour;

import practicefour.StaticDemo.InnerClazz;

public class Constrcutor {

	private Constrcutor a = new Constrcutor();
	
	public Constrcutor(){
		System.out.println("This is a constructor without parameters");
		
	}
	
	
	public Constrcutor(String a){
		System.out.println("This is a constructor with paramter:"+a);
	}
	
	
	public Constrcutor clone(){
		return a;
		
	}
	
	
	public void m1(){};
	public void m2(){};
	public void m3(){};
	public void m4(){
		
	};
	
	public static void main(String[] args){
		
		
	}
}
