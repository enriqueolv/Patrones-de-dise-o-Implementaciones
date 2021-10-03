class Laboratorio{
    private String nombre;
    private String director;
    private String ubicacion;
    private String telefono;
    private String jefeDeLaboratorio;
    private ArrayList<String> servicios;
    

    public Laboratorio() {
    }

    public Laboratorio(String nombre, String director, String ubicacion, String telefono,
     String jefeDeLaboratorio, ArrayList<String> servicios) {
        this.nombre = nombre;
        this.director = director;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.jefeDeLaboratorio = jefeDeLaboratorio;
        this.servicios = servicios;
    }

    public String getNombre() {return this.nombre;}
    public String getDirector() {return this.director;}
    public String getUbicacion() {return this.ubicacion;}
    public String getTelefono() {return this.telefono;}
    public String getJefeDeLaboratorio() {return this.jefeDeLaboratorio;}
    public ArrayList<String> getServicios() {return this.servicios;}
    
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDirector(String director) {this.director = director;}
    public void setUbicacion(String ubicacion) {this.ubicacion = ubicacion;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public void setJefeDeLaboratorio(String jefeDeLaboratorio) {this.jefeDeLaboratorio = jefeDeLaboratorio;}
    public void setServicios(ArrayList<String> servicios) {this.servicios = servicios;}
    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Laboratorio)) {
            return false;
        }
        Laboratorio laboratorio = (Laboratorio) o;
        return Objects.equals(nombre, laboratorio.nombre) && Objects.equals(director, laboratorio.director) && Objects.equals(ubicacion, laboratorio.ubicacion) && Objects.equals(telefono, laboratorio.telefono) && Objects.equals(jefeDeLaboratorio, laboratorio.jefeDeLaboratorio) && Objects.equals(servicios, laboratorio.servicios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, director, ubicacion, telefono, jefeDeLaboratorio, servicios);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", director='" + getDirector() + "'" +
            ", ubicacion='" + getUbicacion() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", jefeDeLaboratorio='" + getJefeDeLaboratorio() + "'" +
            ", servicios='" + getServicios() + "'" +
            "}";
    }

}