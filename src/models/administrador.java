package models;

public class administrador extends PersonalGeneral{
    private String area;

    public administrador() {
    }

    public administrador(String area) {
        this.area = area;
    }

    public administrador(int legajo, String nombre, String apellido, String direccion, String fechaNacimiento, String area) {
        super(legajo, nombre, apellido, direccion, fechaNacimiento);
        this.area = area;
        this.setSueldo(15);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "administrador{" +
                "area='" + area + '\'' +
                '}'+ super.toString();

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
