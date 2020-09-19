package clases;

public class Empleado {

    private double valorHora;
    private double cantidadHora;

    protected Empleado(double vHora, double cHora){ //Parámetros
        valorHora = vHora;
        cantidadHora = cHora;
    }
//Parámetros: Son las variables que hacen referencia al valor que recibirán
    //a través de una función, método, entre otras.
//Argumentos
    protected double getValorHora(){
        return valorHora;
    }

    protected double getCantidadHora(){
        return cantidadHora;
    }

}
