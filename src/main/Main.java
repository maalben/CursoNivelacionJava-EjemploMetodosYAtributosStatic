package main;

import clases.Nomina;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String [] args){

        Logger logger = Logger.getLogger(Main.class.getName());

try {

    double cantidadHoras = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Ingrese las horas trabajadas"));
    double valorHora = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Ingrese el valor de la hora"));
    Nomina nomina = new Nomina(valorHora, cantidadHoras);

    logger.log(Level.INFO, "El salario a pagar es {0} ", nomina.calcularSalario());
    logger.log(Level.INFO, "El salario a pagar con el 10% de descuento {0} ", nomina.calcularSalario(10));
    logger.log(Level.INFO, "Salario con 2% de impuesto y 4% de salud {0} ", nomina.calcularSalario(2, 4));

}catch (NumberFormatException numberFormatException){
    JOptionPane.showMessageDialog(null,"El valor ingresado no es correcto");
    logger.log(Level.WARNING, "El valor ingresado no es correcto");
}catch (Exception exception){
    JOptionPane.showMessageDialog(null,"No se puede procesar su solicitud");
    logger.log(Level.WARNING, "No se puede procesar su solicitud");
}

    }

}
