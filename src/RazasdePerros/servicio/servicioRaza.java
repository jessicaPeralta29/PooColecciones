package RazasdePerros.servicio;

import RazasdePerros.entidad.Raza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class servicioRaza {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Raza> ListaRazas;

    ;
    public servicioRaza() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.ListaRazas = new ArrayList();
    }

    public Raza crearRaza() {

        Raza razas = new Raza();
        //System.out.println("Ingreseq el nombre");
        // String auxNombre;
        //auxNombre = leer.next();
        //razas.setNombre(auxNombre);
        System.out.println("ingrese la raza");
        String auxRaza;
        auxRaza = leer.next();
        razas.setNombre(auxRaza);
        Raza R = new Raza(auxRaza);

        ListaRazas.add(R);
        return R;
    }

    public void Mostrar() {
        for (Raza Raza1 : ListaRazas) {
            System.out.println(Raza1.toString());

        }
        System.out.println("Cantidad demascotas creadas: " + ListaRazas.size());
    }

    public void MostrarConFor() {
        for (int i = 0; i < ListaRazas.size(); i++) {
            System.out.println(ListaRazas.get(i));
        }
    }

    public void EliminarRaza() {
        boolean bandera = false;
        Iterator<Raza> it = ListaRazas.iterator();

        System.out.println("Ingrese la raza a eliminar");
        String eliminarRaza = leer.next().toUpperCase();
//        while (it.hasNext()) {
//            Raza aux = it.next();
//            if (aux.getRaza().equalsIgnoreCase(eliminarRaza)) {
//                // if (aux.getRaza().equals(eliminarRaza)) {
//                it.remove();
        while (it.hasNext()) {
         if (it.next().getRaza().equalsIgnoreCase(eliminarRaza)) {
             it.remove();
                bandera = true;
            } else {
                bandera = false;
            }
        }
        if (bandera) {
            System.out.println("se destruyo la raza");

        } else {
            System.out.println("no existe la raza");
        }
        ListaRazas.forEach((e) -> System.out.println(e));

    }

}
