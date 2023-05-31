package listaenzalada.elemento;

public class Auto implements Elemento {

    private final String patente;

    public Auto(String patente) {
        this.patente = patente;
    }

    public String getPatente() {
        return this.patente;
    }

    @Override
    public boolean esIgual(Elemento elemento) {

        Auto auto = (Auto) elemento;

        return auto.getPatente().equals(patente);
    }
}
