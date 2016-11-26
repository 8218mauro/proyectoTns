package uml;

import java.sql.Date;

public class Tarifas {
    private int cAerolinea;
    private String cOrigen;
    private String cDestino;
    private Date fSalida;
    private Date fLlegada;
    private double precio;

    public Tarifas() {
    }

    public Tarifas(int cAerolinea, String cOrigen, String cDestino, Date fSalida, Date fLlegada, double precio) {
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

    public Date getfSalida() {
        return fSalida;
    }

    public void setfSalida(Date fSalida) {
        this.fSalida = fSalida;
    }

    public Date getfLlegada() {
        return fLlegada;
    }

    public void setfLlegada(Date fLlegada) {
        this.fLlegada = fLlegada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
