class DirectorGeneral extends Profesional{
    private String adscripocion;

    public DirectorGeneral() {}
    public DirectorGeneral(DatosPersonales datosPersonales, String matricula, float salario, ExpedienteAcademico expedienteAcademico, ExpedienteLaboral expedienteLaboral, 
    String adscripocion) {
        super(datosPersonales, matricula, salario, expedienteAcademico, expedienteLaboral);
        this.adscripocion = adscripocion;
    }

    public String getAdscripocion() {return this.adscripocion;}

    public void setAdscripocion(String adscripocion) {this.adscripocion = adscripocion;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DirectorGeneral)) {
            return false;
        }
        DirectorGeneral directorGeneral = (DirectorGeneral) o;
        return Objects.equals(adscripocion, directorGeneral.adscripocion);
    }
    @Override
    public String toString() {
        return "{" +
            " adscripocion='" + getAdscripocion() + "'" +
            "}";
    }
}