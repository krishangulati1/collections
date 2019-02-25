import java.util.concurrent.*;

class WorkThread implements Runnable
{
private String msg;
	WorkThread(String s)
	{
		this.msg=s;
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+" Start msg "+msg);
		processmsg();
		System.out.println(Thread.currentThread().getName()+" End ");
	}
	private void processmsg()
	{
		try{Thread.sleep(2000);}catch(InterruptedException e){e.printStackTrace();}
	}
}
public class Test1
{
	public static void main(String ...z)
	{
		ExecutorService executor= Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++)
		{
			Runnable Worker = new WorkThread(""+i);
			executor.execute(Worker);
		}
		executor.shutdown();
 
		while (!executor.isTerminated()) {   }  
	        System.out.println("Finished all threads");  

	}
}