class DatosPersonales{
    private String nombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private String Direccion;
    private String telefono;
    private String email;

    public DatosPersonales() {}
    public DatosPersonales(String nombre, String apellidoMaterno, String apellidoPaterno, String Direccion, String telefono, String email) {
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {return this.nombre;}
    public String getApellidoMaterno() {return this.apellidoMaterno;}
    public String getApellidoPaterno() {return this.apellidoPaterno;}
    public String getDireccion() {return this.Direccion;}
    public String getTelefono() {return this.telefono;}
    public String getEmail() {return this.email;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellidoMaterno(String apellidoMaterno) {this.apellidoMaterno = apellidoMaterno;}
    public void setApellidoPaterno(String apellidoPaterno) {this.apellidoPaterno = apellidoPaterno;}
    public void setDireccion(String Direccion) {this.Direccion = Direccion;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public void setEmail(String email) {this.email = email;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DatosPersonales)) {
            return false;
        }
        DatosPersonales datosPersonales = (DatosPersonales) o;
        return Objects.equals(nombre, datosPersonales.nombre) && Objects.equals(apellidoMaterno, datosPersonales.apellidoMaterno) && 
        Objects.equals(apellidoPaterno, datosPersonales.apellidoPaterno) && Objects.equals(Direccion, datosPersonales.Direccion) && 
        Objects.equals(telefono, datosPersonales.telefono) && Objects.equals(email, datosPersonales.email);
    }
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", apellidoMaterno='" + getApellidoMaterno() + "'" +
            ", apellidoPaterno='" + getApellidoPaterno() + "'" +
            ", Direccion='" + getDireccion() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }
    
    
}