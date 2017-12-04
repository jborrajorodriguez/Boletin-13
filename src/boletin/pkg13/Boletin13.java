package boletin.pkg13;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Boletin13 {

    public static void main(String[] args) {
        ConversorTemperaturas a=new ConversorTemperaturas();
        a.pedirTemperatura();
        
        try {
            a.centigradosAFharenheit();
        } catch (TemperaturaErradaExcepcion ex) {
            ex.printStackTrace();
        }
        a.centígradosAReamur();
        a.amosar();

    }

}
