public class Fruta extends Producto {
    private String unidad= "kilo";


    public Fruta(String nombre, int precio, String unidad) {
        super(nombre, precio);
        this.unidad = unidad;
    }

    public String getKilo() {

        return unidad;
    }

    public void setKilo(String kilo) {

        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " Contenido: 1" + unidad + " Precio: $" + super.getPrecio();
    }
    }
