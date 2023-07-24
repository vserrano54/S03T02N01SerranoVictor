package Ejercicio1;

public class AgenteDeBolsa implements Observer {
	
	private Observable observable = null;
	private String nombre;
	
	
	public AgenteDeBolsa(BolsaDeValores observable, String nombre) {
		this.observable = observable;
		this.nombre = nombre;
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getNombre() {
		return nombre;
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		System.out.println("Se notifica a "+ this.getNombre()  + " de la actualización de la Bosa de volores en: "+
				((BolsaDeValores) this.observable).getUltimoValor());
	}
	
	

}
