import Models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /// COMENTARIOS:
        /// no me di cuenta y las clases producto y muebles me quedaron el plural (con la s al final)
        /// tal vez la clase mueble se podria evitar ya que no me estria modificando en nada

        /// creo el arrayList para almecenar todos mis productos
        ArrayList <Productos> productos = new ArrayList<>();

        /// creo una instancia de cada producto
        Silla sillita = new Silla(5, "gamer", (float) 55000, true);
        Escritorio escritorio = new Escritorio(3, "grande", (float) 30000, (float)80, (float) 120);
        Impresora impresorita = new Impresora(2, "HP full", (float)35000, "Tony Robbins", 55);
        Notebook notebook = new Notebook(4, "Lenovo", (float)200000, "Jorge Perez", 512);

        /// agrego todos los productos a mi arrayList
        productos.add(sillita);
        productos.add(escritorio);
        productos.add(impresorita);
        productos.add(notebook);

        /// Muestro los productos del ArrayList
        System.out.println("ArrayList de productos...");
        muestraArrayList(productos);

        /// pruebo que funcione el descuento en una silla implementado con la interfaz oferta
        System.out.println("Precio normal: " + sillita.getPrecio());
        Float precioFinal = sillita.descuentoCliente((float)10);
        System.out.println("Precio final: " + precioFinal);

        /// actualizo y muestro los precios de los productos de mi arrayList

        System.out.println("ACTUALIZANDO PRECIOS....");
        mostrarYactualizarPrecios(productos);

    }

    public static void muestraArrayList (ArrayList <Productos> productos){

        // recorro y muestro lo que tengo en mi ArrayList
        for (Productos p : productos){
            System.out.println(p.toString());
        }

    }



    ///muestro el precio y luego lo actualizo. Lo quice hacer por separado pero si luego queria mostrar el precio
    /// viejo no me coincidian por el porcentaje
    public static void mostrarYactualizarPrecios (ArrayList <Productos> productos){

        for(Productos p : productos ){
            if(p instanceof Silla){
                System.out.println("El precio viejo de la silla " + p.getNombre() + " es " + p.getPrecio());
                Float nuevoPrecio =(float) p.getPrecio()-((float)(5*p.getPrecio())/100);
                p.setPrecio(nuevoPrecio);
                System.out.println("El nuevo precio es " + nuevoPrecio);
            }else if(p instanceof Escritorio){
                System.out.println("El precio viejo del escritorio " + p.getNombre() + " es " + p.getPrecio());
                Float nuevoPrecio =(float) p.getPrecio()-((float)(10*p.getPrecio())/100);
                p.setPrecio(nuevoPrecio);
                System.out.println("El nuevo precio es " + nuevoPrecio);
            }else if(p instanceof Impresora){
                System.out.println("El precio viejo de la impresora " + p.getNombre() + " es " + p.getPrecio());
                Float nuevoPrecio =(float) p.getPrecio()-((float)(15*p.getPrecio())/100);
                p.setPrecio(nuevoPrecio);
                System.out.println("El nuevo precio es " + nuevoPrecio);
            }else if(p instanceof Notebook){
                System.out.println("El precio viejo de la notebook" + p.getNombre() + " es " + p.getPrecio());
                Float nuevoPrecio =(float) p.getPrecio()-((float)(20*p.getPrecio())/100);
                p.setPrecio(nuevoPrecio);
                System.out.println("El nuevo precio es " + nuevoPrecio);
            }
        }

    }

}