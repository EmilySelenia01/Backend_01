import javax.swing.JOptionPane;
import java.util.Random;

public class JuegoAdivinanzas {

    public void juego() {
        int contador=5;
        int numero = numeroAleatorio();

        while (contador >0 ) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("¡Bienvenido al juego de adivinanzas!\nInserta un número entre 0 y 100.\n\n"));
            contador--;

            if (opcion != numero) {
                JOptionPane.showMessageDialog(null,"El "+opcion+" no es el numero aleatorio.\n\nTe quedan "+contador+" oportunidades");
            } else {
                JOptionPane.showMessageDialog(null,"¡Ganaste el juego!\nEl numero ganador es: "+numero);
                break;
            }

        }//fin del while

    }//fin del bloque del metodo

    //Para verificar que el codigo funcione
    //Cambia el 101 a un numero mas pequeño para acertar
    private int numeroAleatorio() {
        Random nRandom = new Random();
        int numAleatorio = nRandom.nextInt(0,101);
        return numAleatorio;
    }//fin del bloque del metodo

}//fin de la clase
