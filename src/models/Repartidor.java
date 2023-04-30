package models;

public class Repartidor {
    private String nombre;
    private int horasTrabajadas;
    private static final int sueldoXhora=3;

    public Repartidor(String nombre, int horasTrabajadas) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
    }

    public int calcularSueldoRepartidor(){
        int aPagar=this.horasTrabajadas*this.sueldoXhora;
        return aPagar;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "nombre='" + nombre + '\'' +
                ", horasTrabajadas=" + horasTrabajadas +
                '}';
    }

  }
