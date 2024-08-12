package Inmuebles;

public class local extends inmueble{
    enum tipo {INTERNO, CALLE};
    protected tipo tipo_local;

    public local(int identificador_inmobiliario, int area, String direccion, tipo tipo_local) {
        super(identificador_inmobiliario, area, direccion);
        this.tipo_local = tipo_local;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local = " + tipo_local);
    }
}    

