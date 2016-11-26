package uml;

import java.sql.Date;
import java.sql.Timestamp;

public class Tarifas {
    private int cAerolinea;
    private String cOrigen;
    private String cDestino;
    private Timestamp fSalida;
    private Timestamp fLlegada;
    private double precio;

    public Tarifas() {
    }

    public Tarifas(int cAerolinea, String cOrigen, String cDestino, Timestamp fSalida, Timestamp fLlegada, double precio) {
        this.cAerolinea = cAerolinea;
        this.cOrigen = cOrigen;
        this.cDestino = cDestino;
        this.fSalida = fSalida;
        this.fLlegada = fLlegada;
        this.precio = precio;
    }

    public int getcAerolinea() {
        return cAerolinea;
    }

    public void setcAerolinea(int cAerolinea) {
        this.cAerolinea = cAerolinea;
    }

    public String getcOrigen() {
        return cOrigen;
    }

    public void setcOrigen(String cOrigen) {
        this.cOrigen = cOrigen;
    }

    public String getcDestino() {
        return cDestino;
    }

    public void setcDestino(String cDestino) {
        this.cDestino = cDestino;
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the fSalida
     */
    public Timestamp getfSalida() {
        return fSalida;
    }

    /**
     * @param fSalida the fSalida to set
     */
    public void setfSalida(Timestamp fSalida) {
        this.fSalida = fSalida;
    }

    /**
     * @return the fLlegada
     */
    public Timestamp getfLlegada() {
        return fLlegada;
    }

    /**
     * @param fLlegada the fLlegada to set
     */
    public void setfLlegada(Timestamp fLlegada) {
        this.fLlegada = fLlegada;
    }
    
}
