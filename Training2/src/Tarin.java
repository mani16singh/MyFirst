class Singleton 
{ 
    // static variable single_instance of type Singleton 
    private static Singleton single_instance = null; 
  
    // variable of type String 
    public String s; 
  
    // private constructor restricted to this class itself 
    private Singleton() 
    { 
        s = "Hello I am a string part of Singleton class";
        System.out.println(s);
    } 
  
    // static method to create instance of Singleton class 
    public static Singleton getInstance() 
    { 
    	if(single_instance == null)
    	synchronized(Singleton.class) {
        if (single_instance == null) 
            single_instance = new Singleton();
    	}
  
        return single_instance; 
    } 
    
    public void Display(String a) {
    	s=a;
    	System.out.println(s);
    }
    public void Display() {
    	
    	System.out.println(s);
    	s="heeeeeeeyyyyyy";
    }
}
public class Tarin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Singleton x = Singleton.getInstance();
     Singleton y = Singleton.getInstance();
     x.s="hello";
     y.s="hello";*/
      
     /*x.Display("Hello");
     
     y.Display();
     
     System.out.println("\n\n");
     System.out.println(x.s);*/
      
      
     Thread t1 = new Thread(new Runnable() {
    	 public void run()
    	 {
    		 Singleton obj= Singleton.getInstance();
    		 obj.s="hello";
    	 }
     });
     Thread t2 = new Thread(new Runnable() {
    	 public void run()
    	 {
    		 Singleton obj= Singleton.getInstance();
    		 obj.s="hello";
    	 }
     });
     
    t1.start();
    t2.start();
	}

}
