public class Gaseosa extends Producto {

   private double litros;


    public Gaseosa(String nombre, int precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {

        return litros;
    }

    public void setLitros(double litros) {

        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " Contenido: " + litros + "litros" + " Precio: $" + super.getPrecio();
    }
}
