class Empleado extends Persona{
    private String matricula;
    private float salario;

    public Empleado() {}
    public Empleado(DatosPersonales datosPersonales, String matricula, float salario) {
        super(datosPersonales);
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula() {return this.matricula;}
    public float getSalario() {return this.salario;}
    
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public void setSalario(float salario) {this.salario = salario;}


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return Objects.equals(matricula, empleado.matricula) && salario == empleado.salario;
    }
    @Override
    public String toString() {
        return "{" +
            " matricula='" + getMatricula() + "'" +
            ", salario='" + getSalario() + "'" +
            "}";
    }
}