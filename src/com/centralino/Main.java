package com.centralino;

import java.util.Date;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Clienti[] c = new Clienti[100];
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Clienti("Cliente " + i, new Date());
		}
		
		for(int i=0; i<5; i++) {
			Thread t = new Thread(c[i]);
			t.join();
		}
	}
}
