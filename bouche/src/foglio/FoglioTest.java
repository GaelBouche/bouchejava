package foglio;

import java.util.Random;

public class FoglioTest {

    public static void main(String[] args) {

       Foglio f = new Foglio(17.0, 2.0, "rosso");

        double area = f.calcArea();
        System.out.println(area);
        
        double diagonale = f.calcDiagonale();
        System.out.println(diagonale);
                    
        f.impostaAltezza(25);
        System.out.printf("%.2f", f.getAlezza());
        
        f.impostaBase(25);
        System.out.println(f.getBase());
        
        f.impostaColore("rosso");
        System.out.println(f.getColore());
                
        Random r = new Random();
        int n = r.nextInt(10);
        System.out.println(n);
    }

    
}
