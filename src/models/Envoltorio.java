package models;
import java.util.ArrayList;

import models.PersonalGeneral;
import models.Repartidor;
public class Envoltorio {
    private ArrayList<PersonalGeneral> empleados;
    private ArrayList<Repartidor> repartidores;

    public Envoltorio() {
        empleados = new ArrayList<>();
        repartidores = new ArrayList<>();
    }

    public Boolean agregarEmpleado(PersonalGeneral empleado) {
        Boolean agregado=false;
        if(buscarPorlegajo(empleado.getLegajo()) == null){
            agregado=true;
            empleados.add(empleado);
        }
        return agregado;
    }

    public PersonalGeneral buscarPorlegajo(int legajo) {
        PersonalGeneral encontrado = null;
        int i = 0;
        while (i < empleados.size() && encontrado == null) {
            if (empleados.get(i).getLegajo() == legajo) {
                encontrado = empleados.get(i);
            } else {
                i++;
            }
        }
        return encontrado;
    }
    public int contarEmpleado() {
    int i=0;
        for (PersonalGeneral empleado:empleados) {
            i++;
        }
    return i;
    }

    public String devolverListado() {
        String listado= "nada por ahora";
        if (!empleados.isEmpty()){
            listado="";
            for (PersonalGeneral empleado :empleados) {
                listado+=empleado.toString();
            }
        }
        return listado;
    }

    public Boolean eliminarPorLegajo(int legajo) {
        Boolean eliminado=false;
        PersonalGeneral buscado=null;
        buscado =buscarPorlegajo(legajo);
        if (buscado !=null){
            eliminado=true;
        }
        return eliminado;
    }

    public Boolean agregarRepartidor(Repartidor r) {
        Boolean agregado=false;
        if(buscarPorRepartidor(r) == false){
            repartidores.add(r);
            agregado=true;
        }
        return agregado;
    }
    public Boolean buscarPorRepartidor(Repartidor r) {
        Boolean encontrado = false;
        int i = 0;
        while (i < repartidores.size() && encontrado == false) {
            if (repartidores.equals(repartidores.get(i))) {
                encontrado = true;
            } else {
                i++;
            }
        }
        return encontrado;
    }

    public String devolverListaRepartidor() {
        String listado= "nada por ahora";
        if (!repartidores.isEmpty()){
            listado="";
            for (Repartidor r :repartidores) {
                listado+=r.toString();
            }
        }
        return listado;
    }

    public int getSueldoTotal(){
        int totalApagar = 0;

        for (PersonalGeneral empleado: empleados) {
            totalApagar+=empleado.getSueldo();
        }
        for (Repartidor repartidor :repartidores) {
            totalApagar+=repartidor.calcularSueldoRepartidor();
        }
     return totalApagar;
    }

}
