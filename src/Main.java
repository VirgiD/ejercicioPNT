import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Producto> producto= new ArrayList<>();

        ListaProductos prod = new ListaProductos();

        prod.uploadProduct (new Gaseosa("Coca-Cola Zero",20,1.5));

        prod.uploadProduct(new Gaseosa("Coca-Cola",18,1.5));

        prod.uploadProduct(new Shampoo("Sedal",19,500));

        prod.uploadProduct(new Fruta("Frutilla",64,"kilo"));

        //imprime la lista
        prod.imprimirLista();
       // producto = prod.getListaProductos();

        //ordena la lista
        Collections.sort(producto);
        //imprime el mas caro y el mas barato
        System.out.println("*****************************************************************");
        prod.printMax();
        prod.printMin();

/*
        ListaProductos lista = new ListaProductos(ListaProductos);
        lista.MaxValor();
        lista.MinValor();
 */
    }





}