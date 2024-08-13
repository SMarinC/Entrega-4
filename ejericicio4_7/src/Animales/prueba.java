
package Animales;

public class prueba {

    public static void main(String[] args) {
        animal[] animales = new animal[4];
        animales[0] = new gato();
        animales[1] = new perro();
        animales[2] = new lobo();
        animales[3] = new leon();

        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i].get_nombre_cientifico());
            System.out.println("Sonido: " + animales[i].get_sonido());
            System.out.println("Alimentos: " + animales[i].get_alimentos());
            System.out.println("Habitat: " + animales[i].get_habitat());
            System.out.println();
        }
    }
}
