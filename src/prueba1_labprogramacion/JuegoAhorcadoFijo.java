/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1_labprogramacion;

import java.util.Scanner;

/**
 *
 * @author Gabriela Mejía
 */
public class JuegoAhorcadoFijo extends JuegoAhorcadoBase {

    public JuegoAhorcadoFijo(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
        this.intentos = 7;
        this.palabraActual = "_".repeat(palabraSecreta.length());
    }

    @Override
    public void inicializarPalabraSecreta() {
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
    public void actualizarPalabraActual(char letra) {
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
    public boolean verificarLetra(char letra) {
        return palabraSecreta.contains(String.valueOf(letra));
    }

    @Override
    public boolean hasGanado() {
        return palabraActual.equals(palabraSecreta);
    }
}