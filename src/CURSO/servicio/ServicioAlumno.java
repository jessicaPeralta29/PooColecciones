
package CURSO.servicio;

import CURSO.emtidad.Alumno;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioAlumno {
    
    private Scanner leer;
 //   //aca creo mi Coleccion de Objetos Alumnos   
    private ArrayList<Alumno> alumnosList;
    
    /**
     * constructor sin parametros (o vacio) pero que instacia el scanner y la
     * lista
     */
    public ServicioAlumno() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.alumnosList = new ArrayList();
    }
    
    /*Metodo privado porque lo voy a llamar solo desde esta clase
   
    regressa a alumnos
    */

    private Alumno creaAlumno() {

        System.out.println("Ingrese el nombre del Alumno");
        String nombre = leer.next().toUpperCase();
        //Lista de las notas(3), la cantidad de notas
        HashSet<Integer> notas = new HashSet(3);
        System.out.println("Ingrese las 3 notas del alumno");
        int n1 = leer.nextInt();
        notas.add(n1);
        int n2 = leer.nextInt();
        notas.add(n2);
        int n3 = leer.nextInt();
        notas.add(n3);

        Alumno alumn = new Alumno(nombre, notas);
        alumnosList.add(alumn);

        return alumn;
    }

    
    
    
   public void crearAlumnos() {
        int op;
        //Hacer...
        do {
           //llamo al metodo privado que pide los datos al usuario
            System.out.print("Desea agregar otro Alumno"
                    + " 1- Continuar\n"
                    + " 2-Salir");
            op = leer.nextInt();
        } while (op != 2);//Mientras op sea distinto de N
    } 
  
    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno a calcular");
        String buscado = leer.next().toUpperCase();//lo lee y lo pasa a mayuscula
        
        
        Iterator<Alumno> it = alumnosList.iterator();//Iterator con la lista de alumnos
        
        Integer acumulaNota = 0;//variable para acumular las notas
        
        
        while (it.hasNext()) {
            Alumno aux = it.next();//Objeto auxiliar de la clase Alumno donde voy a ir asignando las iteraciones de it            
            if (aux.getNombre().equals(buscado)) {//comparo si el nombre del objeto auxiliar es igual al nombre "buscado"
                HashSet<Integer> notasAux = aux.getNotas();//cuando encuentra el nombre crea una coleccion HashSet auxiliar para asignar las
                for (Integer notaFin : notasAux) {
                    acumulaNota += notaFin;//notas del alumno encontrado y asi poder recorrer y sumar las notas
                }
                System.out.println("La nota final promedio de: " + aux.getNombre() + " es " +( (float) acumulaNota / 3));
            }
        }                                                                               //aqui obligo un integer ser un float
        if (acumulaNota == 0) {
            System.out.println("No se encontro el Alumno");
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
