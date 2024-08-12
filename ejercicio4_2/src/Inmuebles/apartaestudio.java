package Inmuebles;

public class apartaestudio extends apartamento{
    protected static double valor_area = 1500000;

    public apartaestudio(int identificador_inmobiliario, int area, String direccion, int numero_habitaciones, int numero_banos) {
        super(identificador_inmobiliario, area, direccion, 1, 1);
    }

    public void imprimir() {
        super.imprimir();
        System.out.println();
    }
}    

