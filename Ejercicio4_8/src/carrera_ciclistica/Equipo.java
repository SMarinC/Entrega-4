package carrera_ciclistica;

import java.util.*;

public class Equipo {
    private String nombre; 
    private static double total_tiempo;
    private String pais;
    Vector<Ciclista> lista_ciclistas;
    
    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais =  pais;
        total_tiempo = 0; 
        lista_ciclistas = new Vector<Ciclista>();
    }
        
    public String get_nombre() {
        return nombre;
    }

    public void set_nombre(String nombre) {
        this.nombre = nombre;
    }

    private String get_pais() {
        return pais;
    }
    
    private void set_pais(String pais) {
        this.pais =  pais;
    }

    void add_ciclista(Ciclista ciclista) {
    lista_ciclistas.add(ciclista);
    }
    
    void listar_equipo() {
        for (int i = 0; i < lista_ciclistas.size(); i++) {
            Ciclista c = (Ciclista) lista_ciclistas.elementAt(i);
            System.out.println(c.get_nombre());
        }
    }

    void buscar_ciclista() {
    Scanner sc = new Scanner(System.in);
    String nombreCiclista = sc.next();
    for (int i = 0; i < lista_ciclistas.size(); i++) {
        Ciclista c = (Ciclista) lista_ciclistas.elementAt(i); 
        if (c.get_nombre().equals(nombreCiclista)) {
            System.out.println(c.get_nombre());
        }
        }
    }

    void calcular_total_tiempo() {
        for (int i = 0; i < lista_ciclistas.size(); i++) { // Se recorre el vector
            Ciclista c = (Ciclista) lista_ciclistas.elementAt(i);
            total_tiempo = total_tiempo + c.get_tiempo_acumulado();
        }
    }
    
    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("Pais = " + pais);
        System.out.println("Total tiempo del equipo = " + total_tiempo);
    }
 }

