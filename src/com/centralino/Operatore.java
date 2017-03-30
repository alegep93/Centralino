package com.centralino;

public class Operatore implements Runnable {
	private Cliente cServito;
	private ControlloreOperatori contrOper;
	private int counter;
	
	public Operatore(Cliente cServito, ControlloreOperatori co, int counter){
		this.cServito = cServito;
		this.contrOper = co;
		this.counter = counter;
	}
	
	@Override
	public void run() {
		try{
			System.out.println("Operatore " + counter + " sta servendo: " + cServito.nome + "\r\n --------------------------------------------");
			Thread.sleep(2000);
			System.out.println("Operatore " + counter + " ha finito di servire: " + cServito.nome + "\r\n --------------------------------------------");
			contrOper.DecrementaOpOccupati();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
