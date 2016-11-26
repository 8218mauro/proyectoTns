package uml;

import java.util.Date;

public class Vuelo {
    private int idVuelo;
    private int cReserva;
    private double costo;
    private String cOrigen;
    private String cDestino;
    private Date fSalida;
    private Date fLlegada;
    private int nSilla;

    public Vuelo() {
    }

    public Vuelo(int idVuelo, int cReserva, double costo, String cOrigen, String cDestino, Date fSalida, Date fLlegada, int nSilla) {
        this.idVuelo = idVuelo;
        this.cReserva = cReserva;
        this.costo = costo;
        this.cOrigen = cOrigen;
        this.cDestino = cDestino;
        this.fSalida = fSalida;
        this.fLlegada = fLlegada;
        this.nSilla = nSilla;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public int getcReserva() {
        return cReserva;
    }

    public void setcReserva(int cReserva) {
        this.cReserva = cReserva;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
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

    public int getnSilla() {
        return nSilla;
    }

    public void setnSilla(int nSilla) {
        this.nSilla = nSilla;
    }
    
}
