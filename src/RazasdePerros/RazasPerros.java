package RazasdePerros;

import RazasdePerros.servicio.servicioRaza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import java.util.Scanner;

public class RazasPerros {

    public static void main(String[] args) {

        servicioRaza servi = new servicioRaza();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> perros = new ArrayList();

        int num1;

        do {
            servi.crearRaza();
            System.out.println("Desea crear una nueva raza\n"
                    + "1-confirmar\n"
                    + "2-salir\n");
            num1 = leer.nextInt();
        } while (num1 != 2);
        if (num1 == 2) {
            servi.Mostrar();
//
//            Collections.sort(perros);
//            Iterator it = perros.iterator();
//            boolean existe = false;
//            System.out.println("Ingrese una raza a eliminar");
//            String raza;
//            raza = leer.next();
//            while (it.hasNext()) {
//                if (it.next().equals(raza)) {
//                    existe = true;
                    servi.EliminarRaza();
//               
        }

    }

}


