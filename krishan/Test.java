import java.lang.*;
class Test extends Thread
{
	public void run(){
		System.out.println("Run();");
	}
	public static void main(String []z)
	{

		Test t=new Test();
		t.start();
	}
}
