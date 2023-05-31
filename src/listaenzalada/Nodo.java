package listaenzalada;

import listaenzalada.elemento.Elemento;

public class Nodo {

    private Nodo nodoSiguiente;
    private Nodo nodoAnterior;
    private Elemento elemento;

    public Nodo(Elemento elemento, Nodo nodoAnterior) {
        this.elemento = elemento;
        this.nodoAnterior = nodoAnterior;

        if (nodoAnterior == null) {
            System.out.println("Es null");
        }

    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public void setNodoAnterior(Nodo nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }

    public Nodo getSiguiente() {
        return this.nodoSiguiente;
    }

    public Nodo getNodoAnterior() {
        return this.nodoAnterior;
    }

}
