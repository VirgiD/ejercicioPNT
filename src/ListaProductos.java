import java.util.ArrayList;
import java.util.List;

public class ListaProductos  {
       private List<Producto>listaProductos= new ArrayList<>();


    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        listaProductos = listaProductos;
    }

    public void uploadProduct(Producto producto) {
        listaProductos.add(producto);
    }

    public void imprimirLista() {
        for (Producto producto : listaProductos) {
            System.out.println(producto);

        }
    }

    public void printMax() {
            System.out.println("Producto más caro: " + listaProductos.get(listaProductos.size()-1));
        }
    public void printMin() {
            System.out.println("Producto más barato: " + listaProductos.stream().findFirst().orElseThrow());
        }

    }


/*
    public void MaxValor(){
        int j =0;
        String name = "";
        for(Producto i : ListaProductos)
            if(i.getPrecio()>j){
                j= (int) i.getPrecio();
                name=i.getNombre();
            }
        System.out.println("El producto mas caro es: "+name);
        }

    public void MinValor(){
        int j =1000;
        String name = "";
        for(Producto i : ListaProductos)
            if(i.getPrecio()<j){
                j= (int) i.getPrecio();
                name=i.getNombre();
            }
        System.out.println("El producto mas barato es: "+name);
    }
*/

