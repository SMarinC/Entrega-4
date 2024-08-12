package ejercicio_cuentas;

public class cuenta {

    protected float saldo;
    protected int  numero_consignaciones = 0;
    protected int numero_retiros = 0;
    protected float tasa_anual = 0;
    protected float comision_mensual = 0;

    public cuenta(float saldo, float tasa_anual) {
        this.saldo = saldo;
        this.tasa_anual = tasa_anual;
    }

    public void consignar(float cantidad){
        saldo += cantidad;
        numero_consignaciones++;
    }

    public void retirar(float cantidad){
        float nuevo_saldo = saldo - cantidad;
        if (nuevo_saldo >= 0){
            saldo -= cantidad;
            numero_retiros++;
        }
        else {
            System.out.println("la cantidad a retirar excede el saldo actual");
        }
    }

    public void calcular_interes() {
        float tasa_mensual = tasa_anual / 12;
        float interes_mensual = saldo * tasa_mensual;
        saldo += interes_mensual;
    }

    public void extractoMensual() {
        saldo -= comision_mensual;
        calcular_interes();
    }

}