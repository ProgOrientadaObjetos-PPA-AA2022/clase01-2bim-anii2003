/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALA I
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Ingresar por teclado
        // Objeto de tipo Estudiante Distancia si el usuario ingresa 1 como
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como
        // opción

        // Para que el scanner leea puntos:
        leer.useLocale(Locale.US);

        String nombres;
        String apellidos;
        String identificacion;
        int edad;
        int numAsignaturas;
        double costoAsignaturas;
        int opc;

        System.out.println("Seleccione una de las siguientes opciones:\n"
                + "1. Estudiante Presencial\n"
                + "2. Estudiante Distancia");
        opc = leer.nextInt();

        if (opc == 1 || opc == 2) {
            leer.nextLine();
            System.out.print("Ingrese los nombres del estudiante: ");
            nombres = leer.nextLine();

            System.out.print("Ingrese los apellidos del estudiante: ");
            apellidos = leer.nextLine();

            System.out.print("Ingrese la identificación del estudiante: ");
            identificacion = leer.nextLine();

            System.out.print("Ingrese la edad del estudiante: ");
            edad = leer.nextInt();

            switch (opc) {
                case 1:
                    if (opc == 1) {
                        EstudiantePresencial e1 = new EstudiantePresencial();

                        e1.establecerNombresEstudiante(nombres);
                        e1.establecerApellidoEstudiante(apellidos);
                        e1.establecerIdentificacionEstudiante(identificacion);
                        e1.establecerEdadEstudiante(edad);

                        System.out.print("Ingrese el número de créditos: ");
                        int numCreditos = leer.nextInt();
                        e1.establecerNumeroCreditos(numCreditos);

                        System.out.print("Ingrese el costo del crédito: ");
                        double costoCredito = leer.nextDouble();
                        e1.establecerCostoCredito(costoCredito);

                        e1.calcularMatriculaPresencial();

                        System.out.printf("%s\n", e1);
                    }
                    break;
                case 2:
                    if (opc == 2) {
                        EstudianteDistancia ed1 = new EstudianteDistancia();;

                        ed1.establecerNombresEstudiante(nombres);
                        ed1.establecerApellidoEstudiante(apellidos);
                        ed1.establecerIdentificacionEstudiante(identificacion);
                        ed1.establecerEdadEstudiante(edad);

                        System.out.print("Ingrese el número de asignaturas: ");
                        numAsignaturas = leer.nextInt();
                        ed1.establecerNumeroAsginaturas(numAsignaturas);

                        System.out.print("Ingrese el costo de la asignatura: ");
                        costoAsignaturas = leer.nextDouble();
                        ed1.establecerCostoAsignatura(costoAsignaturas);

                        ed1.calcularMatriculaDistancia();

                        System.out.printf("%s\n", ed1);
                    }
                    break;

            }
        } else {
            System.out.println("Opción incorrecta");
        }
    }
}
