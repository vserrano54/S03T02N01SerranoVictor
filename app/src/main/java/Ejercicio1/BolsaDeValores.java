package Ejercicio1;

import java.util.ArrayList;

public class BolsaDeValores implements Observable {
	
	 ArrayList<Observer> agenteBolsa = new ArrayList<>();
	 private float UltimoValor=0; 

	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		this.agenteBolsa.add(o);
	
		
	}

	@Override
	public void deleteObserver(Observer o) {
		// TODO Auto-generated method stub
		this.agenteBolsa.remove(0);
		
	}

	@Override
	public void notyfyOservers() {
		// TODO Auto-generated method stub
		for (Observer agente : agenteBolsa) {
			
		
		agente.update();            // Realizar acciones con cada Observer en el ArrayList
        }
		
	}
	
	
	public float getUltimoValor() {
		return UltimoValor;
	}
	
	


	public void addNewValue(float valor) {
		this.UltimoValor = valor;
		this.notyfyOservers();
		System.out.println("Se ha actaulizado el valor de la Bosa de valores: "+this.UltimoValor);
		
	}

}
