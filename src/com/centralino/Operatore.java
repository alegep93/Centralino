package com.centralino;

public class Operatore implements Runnable {
	private Cliente cServito;
	private ControlloreOperatori contrOper;
	
	public Operatore(Cliente cServito, ControlloreOperatori co){
		this.cServito = cServito;
		this.contrOper = co;
	}
	
	@Override
	public void run() {
		try{
			System.out.println("Sto servendo: " + cServito.nome);
			Thread.sleep(1000);
			System.out.println("Ho servito: " + cServito.nome);
			System.out.println("---------------------------------");
			contrOper.DecrementaOpOccupati();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
