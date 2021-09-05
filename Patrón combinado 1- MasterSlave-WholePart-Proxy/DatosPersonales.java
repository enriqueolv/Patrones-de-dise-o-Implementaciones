class DatosPersonales{
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String direccion;
    private float peso;
    private float estatura;
    private float IMC;
    
    DatosPersonales(String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, float peso, float estatura, float IMC){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.peso = peso;
        this.estatura = estatura;
        this.IMC = IMC;
    }

    public setNombreCompleto(String nombre, String apellidoPaterno, String apellidoMaterno){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;}
    public setDireccion(String direccion){this.direccion = direccion;}
    public setPeso(float peso){this.peso = peso;}
    public setEstatura(float estatura){this.estatura = estatura;}
    public setIMC(float IMC){this.IMC = IMC;}

    public String getNombreCompleto(){
        String nombreCompleto = nombre + apellidoPaterno + apellidoMaterno;
        return this.nombreCompleto;}
    public String getDireccion(){return this.direccion;}
    public float getPeso(){return this.peso;}
    public float getEstatura(){return this.estatura;}
    public float getIMC(){return this.IMC;}
}