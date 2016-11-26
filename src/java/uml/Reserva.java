package uml;

public class Reserva {
    private int idReserva;
    private int cUsuario;
    private int cAvion;

    public Reserva() {
    }

    public Reserva(int idReserva, int cUsuario, int cAvion) {
        this.idReserva = idReserva;
        this.cUsuario = cUsuario;
        this.cAvion = cAvion;
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
    
    
}
