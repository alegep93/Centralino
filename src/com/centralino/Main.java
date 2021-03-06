package com.centralino;

import java.util.Date;

public class Main {	
	public static void main(String[] args) throws InterruptedException {
		Cliente[] cArray = new Cliente[10];
		ControlloreOperatori contrOper = new ControlloreOperatori();
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i] = new Cliente("Cliente " + i, new Date());
		}
		
		Date startDate = new Date();
		
		int counter = 1;
		
		for (Cliente c : cArray){
			if (counter > 5) counter = 1;
			contrOper.serviClienti(c,counter);
			System.out.println(c.nome + " passato all'operatore " + counter + "\r\n--------------------------------------------");
			counter++;
		}
		
		Date endDate = new Date();
		System.out.println("Tempo totale delle chiamate effettuate: " + (endDate.getTime() - startDate.getTime()) + "ms");
		System.out.println("Ogni operatore ha lavorato mediamente per: " + (endDate.getTime() - startDate.getTime())/5 + "ms");
	}
}
