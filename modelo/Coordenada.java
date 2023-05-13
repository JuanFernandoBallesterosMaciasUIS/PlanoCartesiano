package modelo;

public class Coordenada {

    // Atributos
    private double x;
    private double y;
    
    // Constructores
    public Coordenada() {
    }

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Metodos
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    // metodo para calcular la distancia entre dos punto en el plano
    public double distancia(Coordenada c) {
        double dx = this.x - c.x;
        double dy = this.y - c.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    

    // Metodos de la clase Object

    public String toString() {
        return "(" + x + "," + y + ")";
    }


    public boolean equals(Object obj) {
        Coordenada c = (Coordenada) obj;
        return this.x == c.x && this.y == c.y;
    }
}