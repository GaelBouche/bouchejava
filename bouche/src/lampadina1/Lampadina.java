package lampadina1;

public class Lampadina {

    private String marca;
    private String colore;
    private int maxAcc;
    private int nAcc;
    private boolean stato;

    Lampadina(String phillips, String rosso, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String c) {
        colore = c;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public int getMaxAcc() {
        return maxAcc;
    }

    public int getNAcc() {
        return nAcc;
    }

    public String accendi(String segnalazione) {
        if (stato == true) {
            segnalazione = "La lampadina è già accesa";
        } else {
            if (nAcc == maxAcc) {
                segnalazione = "la lampadina non può essere accesa perchè"
                        + "ha raggiunto il numero massimo di accensioni";
            } else {
                nAcc++;
                stato = true;
                if (nAcc > maxAcc - 10) {
                    segnalazione += "puoi accendere la lampadina per" + (maxAcc - nAcc) + "volte";
                }
            }
        }
        return segnalazione;
    }
    

    public void spegni(String segnalazione) {
        if (stato == false) {
            segnalazione = "la lampadina è già spenta";
        } else {
            stato = false;
            segnalazione = "la lampadina è spenta";
        }
    }

    public String stampa() {
        String s;
        s = "marca: " + marca + " colore: " + colore + " maxAcc: " + maxAcc
                + " nAcc: " + nAcc + "stato: " + stato;
        return s;
    }
}
   