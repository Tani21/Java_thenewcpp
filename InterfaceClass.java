interface Device
{
	void DeviceName();
	void DeviceSpecification();
	
}

interface Functions 
{
	void ForwardArrow();
	void NotificationButton();
	
}

 abstract class Android implements Device
{
	public void DeviceName()
	{
		System.out.println("This is an android device");
	}
	
	public void ForwardArrow()
	{
		System.out.println("Forward Arrow in android: "+"-->");
	}
	
	
}

abstract class IOS extends Android implements Functions
{
	public void DeviceName()
	{
		System.out.println("This is an IOS device");
	}
	
	public void ForwardArrow()
	{
		System.out.println("Forward Arrow in IOS: "+">");
	}
	
	public void Notification()
	{
		System.out.println("A reactangular notification in the center in IOS");
	}
}

class Phone extends IOS
{
	Phone()
	{
		
	}
	
	public void DeviceName()
	{
		System.out.println("Welcome to android device");
	}
	
	public void ForwardArrow()
	{
		System.out.println("This is Forward Arrow in android: "+"-->");
	}
	
	public void NotificationButton()
	{
		System.out.println("A reactangular notification it the top in Android");
	}
	
	public void DeviceSpecification()
	{
		System.out.println("RAM: "+"6GB"+" Screen size: "+"12 cm");
	}
}


public class InterfaceClass {

public static void main(String[] args) {
		Device object = new Phone();
		object.DeviceName();
		object.DeviceSpecification();
		
		System.out.println();
		
		Functions objectTwo = new Phone();
		objectTwo.NotificationButton();
		objectTwo.ForwardArrow();
		
		System.out.println();
		
		Phone objectThree = new Phone();
		objectThree.DeviceName();
		objectThree.DeviceSpecification();
		objectThree.ForwardArrow();
		objectThree.NotificationButton();
		
	}

}

