package lampadina;

public class Lampadina { //prima attributi

    private String marca;
    private String colore;
    private int nMaxAcc;
    private int nAcc;
    private boolean stato;
    //secondo i costruttori 
    //costruttore : inizializza il valore degli attributi

    public lampadina(String marca, String colore, int nMaxAcc,
            int nAcc, boolean stato) {
        this.marca = marca; //assegno il valore della variabile locale alla variabile di istanza
        this.colore = colore;
        this.nMaxAcc = nMaxAcc;
        this.nAcc = nAcc;
        this.stato = stato;
    }

//metodi get e set 
    public String getMarca() {      //restituisce lo stesso tipo di dato che ho dato nella stringa
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
        
}
