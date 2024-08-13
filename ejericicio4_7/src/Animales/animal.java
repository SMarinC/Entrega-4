package Animales;


public abstract class animal {
    protected String sonido;
    protected String alimentos;
    protected String habitat;
    protected String nombre_cientifico;

    public abstract String get_nombre_cientifico();
    public abstract String get_sonido();
    public abstract String get_alimentos();
    public abstract String get_habitat();
}
