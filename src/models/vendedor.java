package models;

public class vendedor extends PersonalGeneral{
    private int montoVenta;

    public vendedor() {
    }

    public vendedor(int montoVenta) {
        this.montoVenta = montoVenta;
    }

    public vendedor(int legajo, String nombre, String apellido, String direccion, String fechaNacimiento, int montoVenta) {
        super(legajo, nombre, apellido, direccion, fechaNacimiento);
        this.montoVenta = montoVenta;
        this.setSueldo(this.montoVenta*3);
    }

    public int getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(int montoVenta) {
        this.montoVenta = montoVenta;
    }

    @Override
    public String toString() {
        return "vendedor{" +
                "montoVenta=" + montoVenta +
                '}'+super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
