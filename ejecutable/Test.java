package ejecutable;
import modelo.Coordenada;

public class Test {

    public static void main(String[] args) {
        Coordenada c1 = new Coordenada();
        Coordenada c2 = new Coordenada(1.3, 5.3);
        Coordenada c3 = c1;
        Coordenada c4 = c2;
    }
}
