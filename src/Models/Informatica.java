package Models;

public class Informatica extends Productos{
    private String nomFabricante;

    public Informatica() {

    }

    public Informatica(Integer stock, String nombre, Float precio, String nomFabricante) {
        super(stock, nombre, precio);
        this.nomFabricante = nomFabricante;
    }

    public String getNomFabricante() {
        return nomFabricante;
    }

    public void setNomFabricante(String nomFabricante) {
        this.nomFabricante = nomFabricante;
    }

    @Override
    public String toString() {
        return "Informatica{" +
                "nomFabricante='" + nomFabricante + '\'' +
                "} " + super.toString();
    }
}
