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

    public AdminPalabrasSecretas() {
        this.palabrasSecretas = new ArrayList<>();
    }

    public void agregarPalabraSecreta(String palabra) {
        palabrasSecretas.add(palabra);
    }

    public String seleccionarPalabraAzar() {
        Random random = new Random();
        int index = random.nextInt(palabrasSecretas.size());
        return palabrasSecretas.get(index);
    }
}