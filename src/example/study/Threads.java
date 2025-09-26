package example.study;


/*
 * thread is light weight sub process are parth of execution within a program
 * 
 * 
 * it can creating using or implement using 1,2
 * init() ,start(),stop(),service --run(),destroy(),sleep(),wait()
 * notify(),notifyall()
 * 
 * thread -- task (timebound ) ---sleep(ms),wait(),await()
 * how thread is imlemented
 * 1.extends thread (class)
 * 2.implement runnable (interface)
 * 
 * 
 * lifecycle of thread
 * 
 * 1.new (constucting) -- starting the thread by intilizing the obj in the class(ex)
 * 2.runnable (prepared to execute the code in interface)
 * 3.running (thread for execution with /without time slot)
 * 4.Blocked (in active)
 * 5.Dead / terminated(thread exit at the run () process)
 * 
 * 
 * thread prirorities(based on the scenario)
 * 1-lowest (Thread.Min_Priority)
 * 5-standard(Thread.NORM_PRIORTY)
 * 10-highest(Thread.MAX_Priorty)
 */

public class Threads extends Thread {
	 public void run()
	    {
	      	String str = "Thread is Running Successfully";
	        System.out.println(str);
	        try {
	        	Thread.sleep(5000);
	        	System.out.println("world");
	        }catch(Exception e) {
	        	System.out.println(e);
	        }System.out.println("hello");
	    }

	public static void main(String[] args) {
		
		Threads t = new Threads();
		t.run();

	}

}
