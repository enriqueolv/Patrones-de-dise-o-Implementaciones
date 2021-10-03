import java.util.ArrayList;

class Hospital{
    private String nombre;
    private String director;
    private String ubicacion;
    private String telefono;
    private ArrayList<String> servicios;
    
    Hospital(String nombre, String director, String ubicacion, String telefono, ArrayList<String> servicios){
        this.nombre = nombre;
        this.director = director;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.servicios = servicios;
    }

    public setNombre(String nombre){this.nombre = nombre;}
    public setDirector(String director){this.director = director;}
    public setUbicacion(String ubicacion){this.ubicacion = ubicacion;}
    public setTelefono(String telefono){this.telefono = telefono;}
    public setServicios(ArrayList<String> servicios){this.servicios = servicios;}

    public String getNombre(){return this.nombre;}
    public String getDirector(){return this.director;}
    public String getUbicacion(){return this.ubicacion;}
    public String gettelefono(){return this.telefono;}
    public ArrayList<String> getServicios(){return this.servicios;}
}