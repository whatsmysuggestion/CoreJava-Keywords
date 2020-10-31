 abstract class A
{
	int a=20;
	
	//it has to print some value
	abstract void get();
	
	void put()
	{
		System.out.println("Hello Welcome"+a);
	} 
 
}   
 
public class AbstExample extends A   {	
	
	
	void get() {
			int a=100;
		System.out.println("Result "+a);
	}	
	
	  public void putty()
	{
		  a=100;
		System.out.println("Putty"+a);
	} 
	  
	public static void main(String[] args) {
		AbstExample ae=new AbstExample();
		ae.put();
		ae.get();
		ae.putty();
		
		 
 
		 
	}
	}
