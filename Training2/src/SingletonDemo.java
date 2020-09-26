//   import java.*;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abc obj1 = abc.INSTANCE;
		obj1.i= 5;
		obj1.show();
		
		abc obj2 = abc.INSTANCE;
		obj2.i=6;
		obj1.show();

	}

}

enum abc
{
	INSTANCE;
	int i;
	public void show()
	{
		System.out.println(i);
	}
	
}
