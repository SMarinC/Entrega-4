package Inmuebles;

public class inmueble_vivienda extends inmueble{
    protected int numero_habitaciones;
    protected int numero_banos;

    public inmueble_vivienda(int identificador_inmobiliario, int area, String direccion, int numero_habitaciones, int numero_banos) {
        super(identificador_inmobiliario, area, direccion);
        this.numero_habitaciones = numero_habitaciones;
        this.numero_banos = numero_banos;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de habitaciones = " + numero_habitaciones);
        System.out.println("Numero de banos = " + numero_banos);
    }
}

