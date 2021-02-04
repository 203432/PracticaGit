public class Jugador {
    String estatus;
    int puntosObt;

    public void setPuntosObt(int puntosObt) {
        this.puntosObt = puntosObt;
    }
    public void setEstatus() {
        if(puntosObt==7 || puntosObt==11){
        this.estatus="Ganador";
        }
        if(puntosObt==2||puntosObt==3||puntosObt==12||puntosObt>12){
        this.estatus="Perdedor";
        }
        if(puntosObt>3 && puntosObt<7 ||puntosObt>7 && puntosObt<11){
        this.estatus="Repetir";
        }
    }
    public int getPuntosObt() {
        return puntosObt;
    }

    public String getEstatus() {
        return estatus;
    }
}
