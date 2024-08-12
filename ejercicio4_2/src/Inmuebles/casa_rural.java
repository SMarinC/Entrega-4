package Inmuebles;

public class casa_rural extends casa{
    protected static double valor_area = 1500000;
    protected int distancia_cabecera;
    protected int altitud;

    public casa_rural(int identificador_inmobiliario, int area, String direccion, int numero_habitaciones, int numero_banos, int numero_pisos, int distancia_cabecera, int altitud) {
        super(identificador_inmobiliario, area, direccion, numero_habitaciones, numero_banos, numero_pisos);
        this.distancia_cabecera = distancia_cabecera;
        this.altitud = altitud;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Distancia a la cabecera municipal = " + distancia_cabecera + " km.");
        System.out.println("Altitud sobre el nivel del mar = " + altitud + " metros.");
        System.out.println();
    }
}

