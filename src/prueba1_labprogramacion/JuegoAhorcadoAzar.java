package prueba1_labprogramacion;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gabriela Mejía
 */
class JuegoAhorcadoAzar extends JuegoAhorcadoBase {

    private List<String> palabrasPosibles;
    private Random random;

    public JuegoAhorcadoAzar(List<String> palabrasPosibles) {
        this.palabrasPosibles = palabrasPosibles;
        this.random = new Random();
        inicializarPalabraSecreta();
        this.intentos = 7;
        this.palabraActual = "_".repeat(palabraSecreta.length());
    }

    @Override
    public void inicializarPalabraSecreta() {
        int index = random.nextInt(palabrasPosibles.size());
        palabraSecreta = palabrasPosibles.get(index);
    }

    @Override
    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        while (intentos > 0 && !hasGanado()) {
            System.out.println("Palabra actual: " + palabraActual);
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Ingresa una letra: ");
            char letra = scanner.next().charAt(0);

            if (!verificarLetra(letra)) {
                intentos--;
            }

            actualizarPalabraActual(letra);
        }

        if (hasGanado()) {
            System.out.println("¡Felicidades! Has ganado. La palabra era: " + palabraSecreta);
        } else {
            System.out.println("¡Perdiste! La palabra correcta era: " + palabraSecreta);
        }
    }

    @Override
    void actualizarPalabraActual(char letra) {
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

    @Override
    boolean verificarLetra(char letra) {
        return palabraSecreta.contains(String.valueOf(letra));
    }

    @Override
    boolean hasGanado() {
        return palabraActual.equals(palabraSecreta);
    }
}
