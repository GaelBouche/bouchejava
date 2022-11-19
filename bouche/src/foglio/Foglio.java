package foglio;

import java.util.*; //libreria java (cartella principale) . (indica che utilizziamo una sottocartella)  util (cartella) *(importo solo una determinata classe)
import java.util.Random;

public class Foglio {

    private double base;
    private double altezza;
    private String colore;

    public Foglio(double b, double a, String c) {
        base = b;
        altezza = a;
        colore = c;
    }

    public double getAlezza() {
        return altezza;
    }

    public double setAlezza(double a) {
        altezza = a;
        return 0;
    }

    public double getBase() {
        return base;
    }

    public double setBase(double b) {
        base = b;
        return 0;
    }

    public double getColore() {
        double c = 0;
        return c;
    }

    public double setColore(String c) {
        colore = c;
        return 0;
    }

    public double calcArea() {
        double area = 0;
        area = base * altezza;
        return area;
    }

    public double calcDiagonale() {
        double diagonale;
        diagonale = Math.sqrt(altezza*altezza) + (base*base);
        return diagonale;
    }

    public double impostaAltezza(double a) {
        
        altezza = a / base;
        return a ;
        
    }

    public double impostaBase(double a) {
        base = a / altezza;
        return a;
    }

    public void impostaColore(String c) {
        colore = c;
    }

    public String stampa(String s) {
        String n;
        n = "valore altezza = " + altezza + "valore base = "+ base + "colore = " + colore;
        
        return s;
    }
}


