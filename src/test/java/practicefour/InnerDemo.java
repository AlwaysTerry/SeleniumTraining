package practicefour;

import practicefour.StaticDemo.InnerClazz;

public class InnerDemo {

	private String out = "out";
	
	private void getClazzName(){
		System.out.println(this.out);
	}
	
	public InnerClazz1 getInnerClazz1(){
		return new InnerClazz1();
	}
	
	public class InnerClazz1 extends StaticDemo{
		
		public  InnerClazz1(){
			System.out.println(out);
		}
	}
	
	public class InnerClazz2 extends StringDemo{
		
		public  InnerClazz2(){
			System.out.println(out);
		}
	}
	
	
	public static void main(String[] args){
		
		InnerDemo.InnerClazz1 a = new InnerDemo().getInnerClazz1();
		a.getStaticMethod();
	}
}
