package abbonamentoMensile;

public class AbbonamentoMensile {

    private String meseCorr;

    public AbbonamentoMensile(String mese) {
        this.meseCorr = mese;
    }

    public String getMeseCorr() {
        return meseCorr;
    }

    public void setMeseCorr(String m) {
        this.meseCorr = m;
    }

    public String calcolaCosto(String nominativo, int etaAbb, boolean sesso) {
        double costo = 0;

        if (sesso == true && etaAbb >= 11 && etaAbb <= 30 || 
            sesso == false && etaAbb >= 15 && etaAbb <= 30) {
            costo = 10;
        } else {
            if (sesso == true && etaAbb >= 31 && etaAbb <= 75 || 
                sesso == false && etaAbb >= 31 && etaAbb < 70) {
                costo = 18.5;
            }
        }
        return meseCorr + ": il costo dell'abbonamento di " + nominativo
                + " sarà di: " + costo;
    }

}

//if (sesso == true && etaAbb <= 10 && etaAbb >= 75|| 
//            sesso == false & etaAbb <= 14 && etaAbb >= 70){
//            costo = 0;
//        }else {
