package Inmuebles;

public class apartamento extends inmueble_vivienda{
    public apartamento(int identificador_inmobiliario, int area, String direccion, int numero_habitaciones, int numero_banos) {
        super(identificador_inmobiliario, area, direccion, numero_habitaciones, numero_banos);
    }

    public void imprimir() {
        super.imprimir();
    }
}    

