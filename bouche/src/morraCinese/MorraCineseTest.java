package morraCinese;
import javax.swing.JOptionPane;

public class MorraCineseTest {

    public static void main(String[] args) {
       String nome1;
       String nome2; // crei due variabili per tenere i nomi
       
       // Mossa myVar = Level.CARTA;
       
       nome1 = JOptionPane.showInputDialog(null, "Nome del computer?","nome comp", JOptionPane.QUESTION_MESSAGE); // creo le finestre in cui chiedo l'imput dei nomi
       nome2 = JOptionPane.showInputDialog(null, "Nome del'utente?","nome utente", JOptionPane.QUESTION_MESSAGE); 
                
              
        MorraCinese m1 = new MorraCinese(nome1, nome2);
        
        JOptionPane.showMessageDialog(null, "Giochiamo!", "morra cinese",JOptionPane.INFORMATION_MESSAGE);//information message (icona che varia)
        
        String temp;
        int inputg2;
        
        temp = JOptionPane.showInputDialog(null, "Inserisci un numero:\n 1 = forbici \n 2 = sasso \n 3 = carta","selezione mossa", JOptionPane.QUESTION_MESSAGE);
        inputg2 = Integer.parseInt(temp); // permette di trsformare una stringa in un numero intero, se si ha una lettera però, il programma da errore 
        JOptionPane.showMessageDialog(null, m1.gioca(inputg2), "risultato", JOptionPane.INFORMATION_MESSAGE);// prima archivia nel temp poi lo converte in int ed in fine lo passa al metodo che lo esegue e lo stampa...
        
        temp = JOptionPane.showInputDialog(null, "Inserisci un numero:\n 1 = forbici \n 2 = sasso \n 3 = carta","selezione mossa", JOptionPane.QUESTION_MESSAGE);
        inputg2 = Integer.parseInt(temp); // permette di trsformare una stringa in un numero intero, se si ha una lettera però, ilprogramma da errore 
        JOptionPane.showMessageDialog(null, m1.gioca(inputg2), "risultato", JOptionPane.INFORMATION_MESSAGE);
         
        temp = JOptionPane.showInputDialog(null, "Inserisci un numero:\n 1 = forbici \n 2 = sasso \n 3 =     carta","selezione mossa", JOptionPane.QUESTION_MESSAGE);
        inputg2 = Integer.parseInt(temp); // permette di trsformare una stringa in un numero intero, se si ha una lettera però, ilprogramma da errore 
        JOptionPane.showMessageDialog(null, m1.gioca(inputg2), "risultato", JOptionPane.INFORMATION_MESSAGE);
    
        
    }
     
}

    


