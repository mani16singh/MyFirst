//import com.phone.Android;
//import com.phone.IOS;
import com.phone.OperatingSystemFactory;
import com.phone.OS;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OS obj = new Android();
		//OS o   bj = new IOS();
		//OS obj = new Windows();
		OperatingSystemFactory osf= new OperatingSystemFactory();
		OS obj1= osf.getInstance("OPEN");
		obj1.spects();

	}

}
