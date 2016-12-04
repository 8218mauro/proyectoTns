package uml;

import java.sql.Date;
import java.sql.Timestamp;

public class Tarifas {
    private int id;
    private Aerolinea cAerolinea;
    private String cOrigen;
    private String cDestino;
    private Timestamp fSalida;
    private Timestamp fLlegada;
    private double precio;
    private int cAvion;

    public Tarifas() {
    }

    public Tarifas(int id, Aerolinea cAerolinea, String cOrigen, String cDestino, Timestamp fSalida, Timestamp fLlegada, double precio, int cAvion) {
        this.id = id;
        this.cAerolinea = cAerolinea;
        this.cOrigen = cOrigen;
        this.cDestino = cDestino;
        this.fSalida = fSalida;
        this.fLlegada = fLlegada;
        this.precio = precio;
        this.cAvion = cAvion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aerolinea getcAerolinea() {
        return cAerolinea;
    }

    public void setcAerolinea(Aerolinea cAerolinea) {
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

    public Timestamp getfSalida() {
        return fSalida;
    }

    public void setfSalida(Timestamp fSalida) {
        this.fSalida = fSalida;
    }

    public Timestamp getfLlegada() {
        return fLlegada;
    }

    public void setfLlegada(Timestamp fLlegada) {
        this.fLlegada = fLlegada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getcAvion() {
        return cAvion;
    }

    public void setcAvion(int cAvion) {
        this.cAvion = cAvion;
    }

    
    
   
    
}
