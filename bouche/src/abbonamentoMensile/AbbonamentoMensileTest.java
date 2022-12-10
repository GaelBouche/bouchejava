package abbonamentoMensile;

public class AbbonamentoMensileTest {

    public static void main(String[] args) {
        AbbonamentoMensile a1 = new AbbonamentoMensile("Dicembre");
        
        System.out.println(a1.calcolaCosto("Gael", 10, true));
        System.out.println(a1.calcolaCosto("Gael", 11, true));
        System.out.println(a1.calcolaCosto("Gael", 75, true));
        System.out.println(a1.calcolaCosto("Gael", 76, true));
       
        System.out.println(a1.calcolaCosto("Gaelle", 11, false));
        System.out.println(a1.calcolaCosto("Gaelle", 16, false));
        System.out.println(a1.calcolaCosto("Gaelle", 44, false));
        System.out.println(a1.calcolaCosto("Gaelle", 70, false));
                
    }
    
}
