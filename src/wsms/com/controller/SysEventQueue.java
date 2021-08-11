package wsms.com.controller;

import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.EmptyStackException;

public final class SysEventQueue extends EventQueue {
	
	private static Date last_act_time;
	private static long timeout_long;
	private static SysEventQueue Queue;

	/*
	* Start the Inactivity timer
	*/
	public static void startInactivityTimer() {
		try {
			Queue = new SysEventQueue();
			Toolkit.getDefaultToolkit().getSystemEventQueue().push(Queue);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
		
		}
	}

	/*----------------------------------------------------------------------------*/
	/**
	* Constructor.
	*/
	/*----------------------------------------------------------------------------*/
	private SysEventQueue() {
		last_act_time = new Date();
	}

	/*----------------------------------------------------------------------------*/
	/**
	* Dispatch Event. Monitors User Activity.
	*/
	/*----------------------------------------------------------------------------*/
	protected void dispatchEvent(AWTEvent e) {
		super.dispatchEvent(e);
		if (e.getID() == MouseEvent.MOUSE_RELEASED || e.getID() == KeyEvent.KEY_RELEASED) {
			last_act_time = new Date();
		}
	}

	/*----------------------------------------------------------------------------*/
	/**
	* Pop the pushed EventQueue.
	*/
	/*----------------------------------------------------------------------------*/
	public void pop() {
		try {
			super.pop();
		}
		catch (EmptyStackException e) {
			e.printStackTrace();
		}
	}

	/*----------------------------------------------------------------------------*/
	/**
	* Timeout or not
	*/
	/*----------------------------------------------------------------------------*/

	public static boolean notTimeout() {
		boolean nottimeout = true;
		
		try {
			// Minute to mili sec
			timeout_long = getTimeOutValue(); //to be defined to return the time out value.
		}
		catch (Exception on){
			timeout_long = 0;
		}
		
		// Check if inactivity time is more than that specified.
		Date cur_time = new Date();
		
		if ((cur_time.getTime() - last_act_time.getTime()) > timeout_long) {
			System.out.println("DISCONNECTING ..............\n");
			System.out.println("********" + timeout_long + "*********\n");
			System.out.println("Curtimr:" + cur_time);
			System.out.println("acttime:" + last_act_time);
			
			Queue.pop(); 
			nottimeout = false;
		}
//		Queue.pop(); 
//		nottimeout = false;
//	}

		return nottimeout;
	}

	private static long getTimeOutValue() {
		return 6000; //for 1 min
	}

}
