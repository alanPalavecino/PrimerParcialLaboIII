package Models;

public class Muebles extends Productos{

    public Muebles() {
    }

    public Muebles(Integer stock, String nombre, Float precio) {
        super(stock, nombre, precio);
    }

    @Override
    public String toString() {
        return "Muebles{} " + super.toString();
    }
}
