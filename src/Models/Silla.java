package Models;

import Interfaces.Oferta;

public class Silla extends Muebles implements Oferta  {
    private Boolean ruedas;

    public Silla() {
    }


    public Silla(Integer stock, String nombre, Float precio, Boolean ruedas) {
        super(stock, nombre, precio);
        this.ruedas = ruedas;
    }

    public Boolean getRuedas() {
        return ruedas;
    }

    public void setRuedas(Boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "ruedas=" + ruedas +
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
