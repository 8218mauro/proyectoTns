package uml;

import java.sql.Timestamp;

public class objCvuelo {
    private int idtarifa;
    private String nAerolinea;
    private String cOrigen;
    private String cDestino;
    private Timestamp fSalida;
    private Timestamp fllegada;
    private Double precio;
    private int cAvion;
    private int nPsajeros;
    private int aDisponibles;

    public objCvuelo() {
    }

    public objCvuelo(int idtarifa, String nAerolinea, String cOrigen, String cDestino, Timestamp fSalida, Timestamp fllegada, Double precio, int cAvion, int nPsajeros, int aDisponibles) {
        this.idtarifa = idtarifa;
        this.nAerolinea = nAerolinea;
        this.cOrigen = cOrigen;
        this.cDestino = cDestino;
        this.fSalida = fSalida;
        this.fllegada = fllegada;
        this.precio = precio;
        this.cAvion = cAvion;
        this.nPsajeros = nPsajeros;
        this.aDisponibles = aDisponibles;
    }

    public int getIdtarifa() {
        return idtarifa;
    }

    public void setIdtarifa(int idtarifa) {
        this.idtarifa = idtarifa;
    }

    public String getnAerolinea() {
        return nAerolinea;
    }

    public void setnAerolinea(String nAerolinea) {
        this.nAerolinea = nAerolinea;
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

    public Timestamp getfSalida() {
        return fSalida;
    }

    public void setfSalida(Timestamp fSalida) {
        this.fSalida = fSalida;
    }

    public Timestamp getFllegada() {
        return fllegada;
    }

    public void setFllegada(Timestamp fllegada) {
        this.fllegada = fllegada;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getcAvion() {
        return cAvion;
    }

    public void setcAvion(int cAvion) {
        this.cAvion = cAvion;
    }

    public int getnPsajeros() {
        return nPsajeros;
    }

    public void setnPsajeros(int nPsajeros) {
        this.nPsajeros = nPsajeros;
    }

    public int getaDisponibles() {
        return aDisponibles;
    }

    public void setaDisponibles(int aDisponibles) {
        this.aDisponibles = aDisponibles;
    }

    
    
    
}
