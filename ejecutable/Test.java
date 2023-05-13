package ejecutable;
import modelo.Coordenada;

public class Test {

    public static void main(String[] args) {
        Coordenada c1 = new Coordenada();
        Coordenada c2 = new Coordenada(1.3, 5.3);
        Coordenada c3 = c1;
        Coordenada c4 = c2;

        // imprimir cada coordenada
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
        System.out.println("c4: " + c4 + "\n");

        // metodo equals
        System.out.println("c1.equals(c2): " + c1.equals(c2));

        // imprimir la distancia entre c1 y c2
        System.out.println("Distancia entre c1 y c2: " + c1.distancia(c2));

    }
}
