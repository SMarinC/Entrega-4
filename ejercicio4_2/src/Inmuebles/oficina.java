package Inmuebles;

public class oficina extends local{
    protected static double valor_area = 3500000;
    protected boolean es_gobierno;

    public oficina(int identificador_inmobiliario, int area, String direccion, tipo tipo_local, boolean es_gobierno) {
        super(identificador_inmobiliario, area, direccion, tipo_local);
        this.es_gobierno = es_gobierno;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Es oficina gubernamental = " + es_gobierno);
        System.out.println();
    }
}
