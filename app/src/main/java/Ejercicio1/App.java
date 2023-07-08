package Ejercicio1;

public class App {
    public static void main(String[] args) {
    	
    	
        AgenteBolsa agenteBolsa = new AgenteBolsa();

        
        AgenciaBolsa agencia1 = new AgenciaBolsa("Agencia 1");
        AgenciaBolsa agencia2 = new AgenciaBolsa("Agencia 2");
        AgenciaBolsa agencia3 = new AgenciaBolsa("Agencia 3");

       
        agenteBolsa.agregarObservador(agencia1);
        agenteBolsa.agregarObservador(agencia2);
        agenteBolsa.agregarObservador(agencia3);

        
        agenteBolsa.setValorBolsa(1500.0);
        agenteBolsa.setValorBolsa(1700.0);

      
        agenteBolsa.eliminarObservador(agencia2);

      
        agenteBolsa.setValorBolsa(2000.0);
        
        
    }
}

