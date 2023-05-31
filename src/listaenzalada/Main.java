package listaenzalada;

import listaenzalada.elemento.Auto;

public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto("FFFF");

        Auto auto2 = new Auto("BBBB");

        ListaEnlazada listaEnlazada = new ListaEnlazada();

        Auto auto3= new Auto("356532353");

        listaEnlazada.agregar(auto);
        listaEnlazada.agregar(auto2);
        listaEnlazada.agregar(
                auto3
        );

        listaEnlazada.imprimirPatentes();

        listaEnlazada.remover(auto2);
        System.out.println("AAAA");

        listaEnlazada.imprimirPatentes();

    }

}
