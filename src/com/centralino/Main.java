package com.centralino;

import java.util.Date;

public class Main {	
	public static void main(String[] args) throws InterruptedException {
		Cliente[] cArray = new Cliente[100];
		ControlloreOperatori contrOper = new ControlloreOperatori();
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i] = new Cliente("Cliente " + i, new Date());
		}
		
		Date startDate = new Date();
		
		for (Cliente c : cArray){
			contrOper.serviClienti(c);
			System.out.println("Cliente " + c.nome + " passato all'operatore");
		}
		
		Date endDate = new Date();
		System.out.println((endDate.getTime() - startDate.getTime()) + "ms");
	}
}
