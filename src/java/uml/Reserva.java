package uml;

public class Reserva {
    private int idReserva;
    private int cUsuario;
    private int cAvion;
    private int cVuelo;
    private double costo;
    private int cSilla;
    
    public Reserva() {
    }

    public Reserva(int idReserva, int cUsuario, int cAvion, int cVuelo, double costo, int cSilla) {
        this.idReserva = idReserva;
        this.cUsuario = cUsuario;
        this.cAvion = cAvion;
        this.cVuelo = cVuelo;
        this.costo = costo;
        this.cSilla = cSilla;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getcUsuario() {
        return cUsuario;
    }

    public void setcUsuario(int cUsuario) {
        this.cUsuario = cUsuario;
    }

    public int getcAvion() {
        return cAvion;
    }

    public void setcAvion(int cAvion) {
        this.cAvion = cAvion;
    }

    public int getcVuelo() {
        return cVuelo;
    }

    public void setcVuelo(int cVuelo) {
        this.cVuelo = cVuelo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getcSilla() {
        return cSilla;
    }

    public void setcSilla(int cSilla) {
        this.cSilla = cSilla;
    }

    
    
    
}
