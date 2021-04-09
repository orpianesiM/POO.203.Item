package org.example;

public class App 
{
    public static void main( String[] args )
    {
        ItemVenta item = new ItemVenta();
        item.setDescripcion("German Pils");
        item.setCantidad(250);
        item.setPrecioUnitario(160);

        ItemVenta item2 = new ItemVenta("Mosaic Light Lager", 100, 190);

        item.calcularPrecioTotal();
        System.out.println("ItemVenta " + item.verDetalle());

        item2.calcularPrecioTotal();
        System.out.println("ItemVenta2 " + item2.verDetalle());


    }
}
