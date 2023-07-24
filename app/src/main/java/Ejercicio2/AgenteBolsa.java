package Ejercicio2;

import java.util.ArrayList;
import java.util.List;


public class AgenteBolsa {
    private List<Observador> observadores;
    private double valorBolsa;

    public AgenteBolsa() {
        observadores = new ArrayList<>();
    }

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarCambios() {
        for (Observador observador : observadores) {
            observador.actualizar(valorBolsa);
        }
    }

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
        notificarCambios();
    }
}
