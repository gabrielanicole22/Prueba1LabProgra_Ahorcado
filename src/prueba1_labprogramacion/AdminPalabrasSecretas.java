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
     //   if (Administrador.EsModoAleatorio){
        this.palabrasSecretas = new ArrayList<>();
        palabrasSecretas.add("lana");
        palabrasSecretas.add("ingeniera");
        palabrasSecretas.add("muneca");
        palabrasSecretas.add("bonita");
        palabrasSecretas.add("estrella");
        palabrasSecretas.add("cielo");
        palabrasSecretas.add("luz");
        palabrasSecretas.add("bruja");
        palabrasSecretas.add("infiel");
        palabrasSecretas.add("swiftie");
      //  seleccionarPalabraAzar();}
    }

    public void agregarPalabraSecreta(String palabra) {
        this.palabra=palabra;
    }

    public void PalabraFija(){
        String palabra="";
        agregarPalabraSecreta(palabra);
    }
    public void seleccionarPalabraAzar() {
        Random random = new Random();
        int index = random.nextInt(palabrasSecretas.size());
        palabra=palabrasSecretas.get(index);
    }
    
public String actualizarPalabraActual(char letra, String palabraSecreta, String palabraActual) {
        char[] nuevaPalabraActual = palabraActual.toCharArray();

        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                nuevaPalabraActual[i] = letra;
            }
        }

        return new String(nuevaPalabraActual);
    }
    public String palabraSecreta( ){
        return palabra;
    }
}