/*Imaginemos un supermercado de barrio.
        Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse, se visualiza lo siguiente por consola y se termina la ejecución:

        Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20

        Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18

        Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19

        Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo

        =============================

        Producto más caro: Frutillas

        Producto más barato: Coca-Cola


        La solución debe cumplir con los siguientes requisitos:

        Diseñar una solución orientada a objetos.
        La salida es por consola y exactamente como se requiere.
        Usar solamente las clases provistas por Java 8..
        Cargar la lista de productos en un único método. No hay ingreso por pantalla de ningún tipo.
        El algoritmo usado para la impresión no tiene que depender de la cantidad o tipo de productos.
        Para mostrar el mayor / menor, utilizar la interfaz Comparable.
        Para imprimir por pantalla, sobrescribir el método toString()
        */

public class Producto implements Comparable<Producto> {
    private String nombre;

    private int precio;



    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }


    public double getPrecio() {

        return precio;
    }

    public void setPrecio(int precio) {

        this.precio = precio;
    }



    @Override
    public int compareTo(Producto o) {

        if (this.precio == o.getPrecio()) {
            return 0;
        } else if (this.precio > o.getPrecio()) {
            return 1;
        } else {
            return -1;
        }
    }

}

