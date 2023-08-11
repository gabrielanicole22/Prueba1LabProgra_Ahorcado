package prueba1_labprogramacion;

import java.util.ArrayList;
import java.util.Random;

public class JuegoAhorcadoAzar extends JuegoAhorcadoBase{

    private ArrayList<String> palabras;

    public JuegoAhorcadoAzar() {
        super (); 
        
        palabras = new ArrayList<>();
        palabras.add("dragon");
        palabras.add("casa");
        palabras.add("guerra");
        palabras.add("paz");
        palabras.add("region");
        palabras.add("mundo");
        palabras.add("anarquismo");
        palabras.add("sociedad");

    }

    public String getPalabraRandom() {
        Random random = new Random();
        int numeroaleatorio=random.nextInt(0,palabras.size());
        
    
    return palabras.remove(numeroaleatorio);
    }

    void actualizarPalabraActual(char letra) {
    
    }

   void verificarLetra(char letra) {
    }

    void hasGanado() {
    }

    public void inicializarPalabraSecreta() {
        
    }

    public void jugar() {
    }

}
