package Ejercicio1;

public class App {
	
	public static void main(String args[]) {
		
		BolsaDeValores bolsavalores = new BolsaDeValores();
		
		AgenteDeBolsa a1 = new AgenteDeBolsa(bolsavalores,"Agente1");
		AgenteDeBolsa a2 = new AgenteDeBolsa(bolsavalores,"Agente2");
		AgenteDeBolsa a3 = new AgenteDeBolsa(bolsavalores,"Agente3");
		AgenteDeBolsa a4 = new AgenteDeBolsa(bolsavalores,"Agente4");
		
		bolsavalores.addObserver(a1);
		bolsavalores.addObserver(a2);
		bolsavalores.addObserver(a3);
		
		bolsavalores.addNewValue(200);
		
		bolsavalores.addObserver(a4);
		
		bolsavalores.addNewValue(300);
	}

}
