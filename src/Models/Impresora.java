package Models;

import Interfaces.Oferta;

public class Impresora extends Informatica implements Oferta {
    private Integer impresionesXMinuto;

    public Impresora() {
    }

    public Impresora(Integer stock, String nombre, Float precio, String nomFabricante, Integer impresionesXMinuto) {
        super(stock, nombre, precio, nomFabricante);
        this.impresionesXMinuto = impresionesXMinuto;
    }

    public Integer getImpresionesXMinuto() {
        return impresionesXMinuto;
    }

    public void setImpresionesXMinuto(Integer impresionesXMinuto) {
        this.impresionesXMinuto = impresionesXMinuto;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "impresionesXMinuto=" + impresionesXMinuto +
                "} " + super.toString();
    }

    @Override
    public Float descuentoCliente(Float porciento) {
        /// mediante esta variable calculo el descuento que se le hace al cliente
        Float descuento = (float)(porciento*getPrecio())/100;
        /// retorno el precio actual menos el descuento, ed decir, el nuevo precio
        return getPrecio()-descuento;
    }
}
