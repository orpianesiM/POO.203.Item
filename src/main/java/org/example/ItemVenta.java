package org.example;

public class ItemVenta {
    private int id;
    private String descripcion;
    private int cantidad;
    private float precioUnitario;
    public float precioTotal;
    private static int ultimoId;        //Atributo estatico para calcular el ultimoID

    /*******************************CONSTRUCTORES********************************************/
    public ItemVenta(){
        this.id = ++ultimoId;
    }

    public ItemVenta(String descripcion, int cantidad, float precioUnitario){
        this();                                 //Llamo al constructor ID
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        calcularPrecioTotal();
    }

    /*****************************GETTERS AND SETTERS****************************************/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }


    /*******************************METODOS********************************************/
    public String verDetalle(){
        String sb = "[ID: " + getId() +
                ", Descripcion: " + getDescripcion() +
                ", Cantidad: " + getCantidad() +
                ", Precio Unitario: $" + getPrecioUnitario() +
                ", Precio Total: $" + this.precioTotal + "]";
        return sb;
    }

    public void calcularPrecioTotal(){
        this.precioTotal = this.precioUnitario * this.cantidad;
    }
}
