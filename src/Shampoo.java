public class Shampoo extends Producto {
     private int contenido;


    public Shampoo(String nombre,  int precio, int contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public int getContenido() {

        return contenido;
    }

    public void setContenido(int contenido) {

        this.contenido = contenido;
    }
    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " Contenido: " + contenido + "ml"+ " Precio: $" + super.getPrecio();
    }

}
