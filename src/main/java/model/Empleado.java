package model;

import interfaces.Printable;
import interfaces.Storable;

public class Empleado implements Printable,Storable {

    private String nombre;
    private int numHorasRegulares;
    private int horasTrabajadas;
   

    public Empleado(String nombre, int numHorasRegulares) {
        this.nombre = nombre;
        this.numHorasRegulares = numHorasRegulares;
        this.horasTrabajadas = numHorasRegulares * 20;

    }

    public int reporteHoras() {
        return horasTrabajadas;
    }

    public double calcularPago() {
        double pago;
        pago = this.horasTrabajadas * 100;

        return pago;
    }
    



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String infoToStore() {
        // TODO Auto-generated method stub
        return this.nombre+","+numHorasRegulares+","+horasTrabajadas;
    }

    @Override
    public String infoToPrint() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
