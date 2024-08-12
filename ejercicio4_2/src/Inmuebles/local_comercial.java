package Inmuebles;

public class local_comercial extends local{
    protected static double valor_area = 3000000;
    protected String centro_comercial;

    public local_comercial(int identificador_inmobiliario, int area, String direccion, tipo tipo_local, String centro_comercial) {
        super(identificador_inmobiliario, area, direccion, tipo_local);
        this.centro_comercial = centro_comercial;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Centro comercial = " + centro_comercial);
        System.out.println();
    }
}

