package com.pheonix.threads;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 16-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class PingPongRunnable implements Runnable {
	
	private String message;
	private long delay;
	
	public PingPongRunnable(String message,long delay) {
		// TODO Auto-generated constructor stub
		this.message = message;
		this.delay = delay;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<5;i++) {
				System.out.println(message);
				Thread.sleep(delay);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Runnable r1 = new PingPongRunnable("Pong", 1000);
		Runnable r2 = new PingPongRunnable("Ping",1200);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
