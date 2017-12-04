package boletin.pkg13;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class ConversorTemperaturas {

    final int max=80;
    public float temperatura, fharenheit, reamur;
    /**
     * Método pedirTemperatura:
     * Recibe el valor de temperatura.
     * @return 
     */
    public float pedirTemperatura(){
        temperatura=Float.parseFloat(JOptionPane.showInputDialog("Introduce los Grados Centigrados"));//Se le da un valor a la Temperatura.  
        return temperatura;
    }
    /**
     * Método centigradosAFharenheit: Se encarga de convertir los grados
     * centrigrados en grados fharenheit.
     *
     * @return un valor float.
     */
    public float centigradosAFharenheit() throws TemperaturaErradaExcepcion {

        
        if (temperatura>max) {
            fharenheit=(float) (9.0/5.0*temperatura+32.4);
            return fharenheit;
        }
        else {
            throw new TemperaturaErradaExcepcion("Tiene que ser Superior de 80ºC");

        }
    }

    /**
     * Método centígradosAReamur: Se encarga de convertir los grados centigrados
     * en grados Reamur
     *
     * @return devuelve un valor float.
     */
    public float centígradosAReamur() {
        
        try {
            if (temperatura>max) {
                reamur=(float) (4.0/5.0*temperatura);
               
            }
            else {throw new TemperaturaErradaExcepcion("Tiene que ser Superior de 80ºC");

            }
        } catch (TemperaturaErradaExcepcion e1) {
            e1.printStackTrace();
        }
        return reamur;
    }
        /**
         * Método amosar: Muestra mediante un JOptionPane un mensaje.
         */
    public void amosar() {
        JOptionPane.showMessageDialog(null,"Temperatura en grados centigrados = "+temperatura+"\nTemperatura en grados Fharenheit = "+fharenheit+"\nTemperatura en grados Reamur = "+reamur);

    }

}
