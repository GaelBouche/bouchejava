package indovinaNumero;

public class IndovinaNumero {

    private int numPensato; //attributo

    public IndovinaNumero(int numPensato) { //costruttore
        this.numPensato = numPensato;
    }

    public int getNumPensato() { //non hanno parametri mai 
        return numPensato; //si può metter this. ma non è indispensabile
    }

    public void setNumPensato(int n) {
        numPensato = n;
    }

    public String pensa() { //metodo
        int    num   = 0 ;
        String testo = ""; // non è una variabile ma è una variabile reference, all'inizio non contiene nulla ma si crea soltanto lo spazio in memeoria

        num   = numPensato + 4;
        num   = num * 2 ;
        num   = num + 10;
        num   = num - 8 ;
        num   = num / 2 ;
        num   = num - numPensato;
        
        testo = "il numero pensato è= " + numPensato + " il numero restituito "
                + "è=" + num;
        
        return testo;
    }

    public String stampa() {
        String s = "numero pensato: " + numPensato;
        return s;
    }
}
