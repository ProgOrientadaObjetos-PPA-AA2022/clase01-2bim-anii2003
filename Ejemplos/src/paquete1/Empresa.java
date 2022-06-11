/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {

    private String nombre;
    private Edificio[] edificios;
    private Vehiculo[] vehiculos; // tipo, matrícula, valor
    private double costoBienesInmuebles;
    private double costoVehiculos;
    private double costoTotalBienes;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void establecerCostoBienesInmuebles() {
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            suma = suma + edificios[i].obtenerCosto();
        }

        costoBienesInmuebles = suma;
    }
    
    public void establecerVehiculos(Vehiculo[] v){
        vehiculos = v;
    }

    public void establecerCostoVehiculos() {
        double suma = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            suma = suma + vehiculos[i].obtenerValor();
        }

        costoVehiculos = suma;
    }
    
    public void establecerTotalBienes(){
        costoTotalBienes = costoBienesInmuebles + costoVehiculos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public double obtenerCostoBienesInmuebles() {
        return costoBienesInmuebles;
    }

    public double obtenerCostoVehiculos() {
        return costoVehiculos;
    }
    
    public double obtenerTotalBienes(){
        return costoTotalBienes;
    }

    public String toString() {
        String reporte = String.format("%s\nListado de Edificios: \n", nombre);
        for (int i = 0; i < edificios.length; i++) {
            reporte = String.format("%s%d. %s (%.2f)\n", reporte,
                    i + 1,
                    edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto());
        }
        reporte = String.format("%s"
                + "Total de inmuebles: %.2f\n",
                reporte,
                costoBienesInmuebles);

        reporte = String.format("%s\nLista de Vehiculos: \n", reporte);
        for (int i = 0; i < vehiculos.length; i++) {
            reporte = String.format("%s%d. %s, %s (%.2f)\n", reporte,
                    i + 1,
                    vehiculos[i].obtenerTipo(),
                    vehiculos[i].obtenerMatricula(),
                    vehiculos[i].obtenerValor());
        }

        reporte = String.format("%s"
                + "Total de vehiculos: %.2f\n",reporte,
                costoVehiculos);
        
        reporte = String.format("\n%s\n"
                + "Total bienes: %.2f",reporte,
                costoTotalBienes);
        
        return reporte;
    }
}
