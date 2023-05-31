package listaenzalada;

import listaenzalada.elemento.Auto;
import listaenzalada.elemento.Elemento;

public class ListaEnlazada {

    private Nodo cabeza;
    private Nodo ultimo;

    public ListaEnlazada() {

    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregar(Elemento elemento) {

        if (cabeza == null) {
            cabeza = new Nodo(elemento, null);
            return;
        }

        Nodo nodo = cabeza;

        while (true) {

            if (nodo.getSiguiente() == null) {
                nodo.setSiguiente(
                        new Nodo(elemento, nodo)
                );
                break;
            }

            nodo = nodo.getSiguiente();

        }

    }

    public void remover(Elemento elemento) {

        if (cabeza.getElemento().equals(elemento)) {

            Nodo siguiente = cabeza.getSiguiente();
            siguiente.setNodoAnterior(null);

            cabeza.setSiguiente(null);

            cabeza = siguiente;

            return;
        }

        Nodo nodo = cabeza;

        while (true) {

            if (nodo.getElemento().esIgual(elemento)) {

                if (nodo.getSiguiente() == null) {

                    Nodo anterior = nodo.getNodoAnterior();

                    if (anterior == null) {
                        System.out.println("EL NODO ANTERIOR ES NULO");
                    }

                    anterior.setSiguiente(null);


                    nodo.setNodoAnterior(null);
                    break;
                }

                Nodo nodoAnterior = nodo.getNodoAnterior();
                Nodo nodoSiguiente = nodo.getSiguiente();

                nodoAnterior.setSiguiente(nodoSiguiente);
                nodoSiguiente.setNodoAnterior(nodoAnterior);

            }

            nodo = nodo.getSiguiente();

            if (nodo == null) {
                break;
            }


        }

    }

    public boolean existeElemento(Elemento elemento) {

        if (cabeza.getElemento().esIgual(elemento)) {
            return true;
        }

        Nodo nodo = cabeza;

        while (true) {

            if (nodo.getElemento().esIgual(elemento)) {
                return true;
            }

            if (nodo.getSiguiente() == null) {
                return false;
            }

            nodo = nodo.getSiguiente();

        }

    }

    public void imprimirPatentes() {

        Nodo nodo = cabeza;
        Auto auto = (Auto) nodo.getElemento();
        System.out.println(auto.getPatente());


        while (true) {

            if (nodo.getSiguiente() == null) {
                break;
            }

            nodo = nodo.getSiguiente();

            auto = (Auto) nodo.getElemento();
            System.out.println(auto.getPatente());

        }

    }

    public void vaciar() {
        cabeza = null;
    }

}
