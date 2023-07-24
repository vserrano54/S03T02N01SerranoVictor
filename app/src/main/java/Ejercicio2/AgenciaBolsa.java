package Ejercicio2;


public class AgenciaBolsa implements Observador {
 private String nombre;

 public AgenciaBolsa(String nombre) {
     this.nombre = nombre;
 }

 @Override
 public void actualizar(double valor) {
     System.out.println(nombre + ": El valor de la Bolsa ha cambiado a " + valor);
 }
}
