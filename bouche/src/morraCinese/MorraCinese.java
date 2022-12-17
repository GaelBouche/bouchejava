package morraCinese;

import java.util.Random;

public class MorraCinese {

    private String g1;
    private String g2;

    Random r1 = new Random();

    public MorraCinese(String g1, String g2) {
        this.g1 = g1;
        this.g2 = g2;
    }

    public String getG1() {
        return g1;
    }

    public void setG1(String g1) {
        this.g1 = g1;
    }

    public String getG2() {
        return g2;
    }

    public void setG2(String g2) {
        this.g2 = g2;
    }

    public String gioca(int giocataG2) {
        String testo = "";
        String mossa1 = "";
        String mossa2 = "";
        int giocataG1 = r1.nextInt(3) + 1;
        int mano = 0;
        

        /*
        switch (giocataG2){
            case 1:
                testo = "CARTA";
            case 2:
                testo = "FORBICE";
            case 3: 
                testo = "SASSO";
                break;
            default:
                if(giocataG2 < 1 || giocataG2 > 3){
                testo = "giocata non prevista";}
        }
          switch (giocataG1){
            case 1:
                testo = "CARTA";
            case 2:
                testo = "FORBICE";
            case 3: 
                testo = "SASSO";
                break;
            default:
                if(giocataG1 < 1 || giocataG1 > 3){
                testo = "giocata non prevista";}
          }
        */
        
       /* 
        enum Mossa{
        CARTA,
        FORBICE,
        SASSO
        }
       */  
         
        if (giocataG1 == 1) {
            mossa1 = "forbici";
        } else {
            if (giocataG1 == 2) {
                mossa1 = "sasso";
            } else {
                mossa1 = "carta";
            }
        }
        if (giocataG2 == 1) {
            mossa2 = "forbici";
        } else {
            if (giocataG2 == 2) {
                mossa2 = "sasso";
            } else {
                mossa2 = "carta";
            }
        }

        if (giocataG1 == giocataG2) {
            testo = "Pareggio. Hanno giocato " + mossa1 + " contro " + mossa2;
        } else {

            if (giocataG1 == 3 && giocataG2 == 2
                    || giocataG1 == 1 && giocataG2 == 3
                    || giocataG1 == 2 && giocataG2 == 1) {

                testo = g1 + " è il vincitore, ha giocato " + mossa1
                        + " contro " + mossa2;

            } else {

                if (giocataG2 == 1 && giocataG1 == 3
                        || giocataG2 == 2 && giocataG1 == 1
                        || giocataG2 == 3 && giocataG1 == 2) {

                    testo = g2 + " è il vincitore, ha giocato " + mossa2
                            + " contro " + mossa1;
                }

            }
        }
        return testo;
    }

    public String stampa() {
        return "Nome computer: " + g1 + "\nNome giocatore: " + g2;
    }
 }
