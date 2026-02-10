package org.yourcompany.yourproject;

public class Socio extends Usuario{
    private int limiteEjemplares;
    private int ejemplaresEnPrestamo;
    private double multasPendientes;

    public Socio (String id, String nombre, String email, int limiteEjemplares){
        super (id, nombre, email);
        this.limiteEjemplares = limiteEjemplares;

    }

    public void registrarPrestamo(int cantidad){
        if (cantidad > (limiteEjemplares - ejemplaresEnPrestamo)){
            throw new IllegalArgumentException("Supera el límite de ejemplares");
        }
        if (multasPendientes > 0){
            throw new IllegalArgumentException("No puede pedir ejemplares ya que tiene multa");
        }
        System.out.println("Se prestaron " + cantidad + " libros.");
    }

}
