/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // Objeto de tipo Estudiante Distancia
        // por teclado
        
        String nombres;
        String apellidos;
        String identificacion;
        int edad;
        int numAsignaturas;
        double costoAsignaturas;
        
        Scanner leer = new Scanner (System.in);
        
        // Para que el scanner leea puntos:
        leer.useLocale(Locale.US);
        
        EstudianteDistancia ed1 = new EstudianteDistancia();
        
        System.out.print("Ingrese los nombres del estudiante: ");
        nombres = leer.nextLine();
        ed1.establecerNombresEstudiante(nombres);
        
        System.out.print("Ingrese los apellidos del estudiante: ");
        apellidos = leer.nextLine();        
        ed1.establecerApellidoEstudiante(apellidos);
        
        System.out.print("Ingrese la identificación del estudiante: ");
        identificacion = leer.nextLine();           
        ed1.establecerIdentificacionEstudiante(identificacion);
        
        System.out.print("Ingrese la edad del estudiante: ");
        edad = leer.nextInt();        
        ed1.establecerEdadEstudiante(edad);
        
        System.out.print("Ingrese el número de asignaturas: ");
        numAsignaturas = leer.nextInt();           
        ed1.establecerNumeroAsginaturas(numAsignaturas);
        
        System.out.print("Ingrese el costo de la asignatura: ");
        costoAsignaturas = leer.nextDouble();     
        ed1.establecerCostoAsignatura(costoAsignaturas);
        
        ed1.calcularMatriculaDistancia();
        
        System.out.printf("%s\n",ed1);              
    }
}
