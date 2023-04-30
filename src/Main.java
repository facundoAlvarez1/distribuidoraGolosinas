import models.administrador;
import  models.Envoltorio;
import models.vendedor;
import models.Repartidor;

public class Main {
    public static void main(String[] args) {
        administrador a = new administrador(1019,"Facundo","Alvarez","asddasd",null,"RRHH");
        vendedor v=new vendedor(2019,"Pedro","Loco","123fas",null,1000);
        Envoltorio e = new Envoltorio();
        Boolean agregado =false;

        //agregar
        agregado= e.agregarEmpleado(a);
        if (agregado !=false){
            System.out.println("Agregado exitosamente...");
        }else{
            System.out.println("SALIO MAL");
        }

        agregado=e.agregarEmpleado(v);
        if (agregado !=false){
            System.out.println("Agregado exitosamente...");
        }else{
            System.out.println("SALIO MAL");
        }

        ///Buscar
        if(e.buscarPorlegajo(1019)!=null) {
            System.out.println("Existe");
        }

        if(e.buscarPorlegajo(3)!=null){
            System.out.println("No");
        }
        else{
            System.out.println("no existe en array");
        }

        //Contar
        int cant =e.contarEmpleado();
        System.out.println("La cantidad es " + cant);
        System.out.println("lISTA DE EMPLEADOS");
        System.out.println(e.devolverListado());
        System.out.println();

        //Eliminar
        if(e.eliminarPorLegajo(1019)==true){
            System.out.println("Se elimino");
        }else{
            System.out.println("Fallo");
        }

        System.out.println("lISTA DE EMPLEADOS luego de eliminar");
        System.out.println(e.devolverListado());

        e.agregarEmpleado(a);

        Repartidor r1 =new Repartidor("Pepe",31);
        Repartidor r2=new Repartidor("Pepeeee",33);
        Repartidor r3 =new Repartidor("Pepeeeeeeee",12);

        e.agregarRepartidor(r1);
        e.agregarRepartidor(r2);
        e.agregarRepartidor(r3);

        System.out.println(e.devolverListaRepartidor());

        System.out.println("pagar: " + e.getSueldoTotal());

        }
 }
