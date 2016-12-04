package uml;

import java.util.Date;

public class Vuelo {
  
    private int coAvion;
    private int cReserva;
    private String cOrigen;
    private String cDestino;
    private Date fSalida;
    private Date fLlegada;
    private int aDisponibles;

    public Vuelo() {
    }

    public Vuelo(int coAvion, int cReserva, String cOrigen, String cDestino, Date fSalida, Date fLlegada, int aDisponibles) {
        this.coAvion = coAvion;
        this.cReserva = cReserva;
        this.cOrigen = cOrigen;
        this.cDestino = cDestino;
        this.fSalida = fSalida;
        this.fLlegada = fLlegada;
        this.aDisponibles = aDisponibles;
    }

    public int getCoAvion() {
        return coAvion;
    }

    public void setCoAvion(int coAvion) {
        this.coAvion = coAvion;
    }

    public int getcReserva() {
        return cReserva;
    }

    public void setcReserva(int cReserva) {
        this.cReserva = cReserva;
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

    public int getaDisponibles() {
        return aDisponibles;
    }

    public void setaDisponibles(int aDisponibles) {
        this.aDisponibles = aDisponibles;
    }

    
    
}
