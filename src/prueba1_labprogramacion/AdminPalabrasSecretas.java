package prueba1_labprogramacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Gabriela Mejia
 */
public class AdminPalabrasSecretas {
     List<String> palabrasSecretas;
     
     private String palabra;
     

    public AdminPalabrasSecretas() {
        this.palabrasSecretas = new ArrayList<>();
        palabrasSecretas.add("Lana");
        palabrasSecretas.add("Ingeniera");
        palabrasSecretas.add("Muneca");
        palabrasSecretas.add("Bonita");
        palabrasSecretas.add("Estrella");
        palabrasSecretas.add("Cielo");
        palabrasSecretas.add("Luz");
        palabrasSecretas.add("Bruja");
        palabrasSecretas.add("Infiel");
        palabrasSecretas.add("Swiftie");
    }

    public void agregarPalabraSecreta(String palabra) {
        this.palabra=palabra;
    }

    public void seleccionarPalabraAzar() {
        Random random = new Random();
        int index = random.nextInt(palabrasSecretas.size());
        palabra=palabrasSecretas.get(index);
    }
    
    public String palabraSecreta( ){
        return palabra;
    }
}