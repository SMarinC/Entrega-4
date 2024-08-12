package Inmuebles;

public class casa_independiente extends casa_urbana{
protected static double valor_area = 3000000;

    public casa_independiente(int identificador_inmobiliario, int area, String direccion, int numero_habitaciones, int numero_banos, int numero_pisos) {
        super(identificador_inmobiliario, area, direccion, numero_habitaciones, numero_banos, numero_pisos);
    }

    public void imprimir() {
        super.imprimir();
        System.out.println();
    }
}    

