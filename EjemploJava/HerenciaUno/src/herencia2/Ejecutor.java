/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.EstudiantePresencial;
import herencia1.EstudianteDistancia;
/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Objeto de tipo Estudiante Presencial
        EstudiantePresencial e1 = new EstudiantePresencial();
        
        e1.establecerNombresEstudiante("Ana Carolina");        
        e1.establecerApellidoEstudiante("Churo Briceño");
        e1.establecerIdentificacionEstudiante("1106053190");
        e1.establecerEdadEstudiante(19);
        
        e1.establecerNumeroCreditos(30);
        e1.establecerCostoCredito(15);
        e1.calcularMatriculaPresencial();
        
        System.out.printf("Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Identificación: %s\n"
                + "Edad: %d\n"
                + "Número de créditos: %d\n"
                + "Costo crédito: %.2f\n"
                + "Costo matrícula:%.2f\n",
                e1.obtenerNombresEstudiante(),
                e1.obtenerApellidoEstudiante(),
                e1.obtenerIdentificacionEstudiante(),
                e1.obtenerEdadEstudiante(),
                e1.obtenerNumeroCreditos(),
                e1.obtenerCostoCredito(),
                e1.obtenerMatriculaPresencial());
    }
}
