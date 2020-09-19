package clases;

public class Nomina extends Empleado {

    public Nomina(double vHora, double cHora) {
        super(vHora, cHora);
    }

    public double calcularSalario(){
        return (getCantidadHora() * getValorHora());
    }

    public double calcularSalario(double impuesto){
        return ( calcularSalario() - (calcularSalario() * (impuesto / 100) ) );
    }

    public double calcularSalario(double impuesto, double salud){
        return ( calcularSalario() - ( (calcularSalario() * (impuesto / 100) ) +  (calcularSalario() * (salud / 100) ) ));
    }

}
