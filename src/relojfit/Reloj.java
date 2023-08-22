
package relojfit;

import java.util.Calendar;


public class Reloj {
    String dia;
    String hora;
    String modelo;
    long numSerie;    
    private Calendar horaActual;


    public int getDia() {
        return horaActual.get(Calendar.DAY_OF_MONTH);
    }
    
    public String getHora() {
        int horaNum = horaActual.get(Calendar.HOUR_OF_DAY);
        int minuto = horaActual.get(Calendar.MINUTE);
        return String.format("%02d:%02d", horaNum, minuto);
    }

    public void incrementarDia() {
        horaActual.add(Calendar.DAY_OF_MONTH, 1);
    }


    public void incrementarHora(int horas) {
        horaActual.add(Calendar.HOUR_OF_DAY, horas);
    }
    
    public void limpiarPantalla() {
        
    }

   
}
