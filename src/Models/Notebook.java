package Models;

public class Notebook extends Informatica{
    private Integer memoria;

    public Notebook() {

    }

    public Notebook(Integer stock, String nombre, Float precio, String nomFabricante, Integer memoria) {
        super(stock, nombre, precio, nomFabricante);
        this.memoria = memoria;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "memoria=" + memoria +
                "} " + super.toString();
    }
}
