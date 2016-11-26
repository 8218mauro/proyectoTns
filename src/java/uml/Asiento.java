package uml;

public class Asiento {
    private int nAsiento;
    private int cAvion;
    private String estado;

    public Asiento() {
    }

    public Asiento(int nAsiento, int cAvion, String estado) {
        this.nAsiento = nAsiento;
        this.cAvion = cAvion;
        this.estado = estado;
    }

    public int getnAsiento() {
        return nAsiento;
    }

    public void setnAsiento(int nAsiento) {
        this.nAsiento = nAsiento;
    }

    public int getcAvion() {
        return cAvion;
    }

    public void setcAvion(int cAvion) {
        this.cAvion = cAvion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
}
