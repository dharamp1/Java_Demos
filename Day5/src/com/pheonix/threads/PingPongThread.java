package com.pheonix.threads;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 16-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class PingPongThread extends Thread {
	
	private String message;
	private long delay;
	
	public PingPongThread(String message,long delay) {
		// TODO Auto-generated constructor stub
		this.message = message;
		this.delay = delay;
	}
	
	public void run() {
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
		// TODO Auto-generated method stub
		
		Thread t1 = new PingPongThread("Ping", 500);
		Thread t2 = new PingPongThread("Pong",700);
		
		t1.start();
		t2.start();
	}

}
