class Profesional extends Empleado{
    private ExpedienteAcademico expedienteAcademico;
    private ExpedienteLaboral expedienteLaboral;

    public Profesional() {}
    public Profesional(DatosPersonales datosPersonales, String matricula, float salario, ExpedienteAcademico expedienteAcademico, ExpedienteLaboral expedienteLaboral) {
        super(datosPersonales, matricula, salario);
        this.expedienteAcademico = expedienteAcademico;
        this.expedienteLaboral = expedienteLaboral;
    }

    public ExpedienteAcademico getExpedienteAcademico() {return this.expedienteAcademico;}
    public ExpedienteLaboral getExpedienteLaboral() {return this.expedienteLaboral;}

    public void setExpedienteAcademico(ExpedienteAcademico expedienteAcademico) {this.expedienteAcademico = expedienteAcademico;}
    public void setExpedienteLaboral(ExpedienteLaboral expedienteLaboral) {this.expedienteLaboral = expedienteLaboral;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Profesional)) {
            return false;
        }
        Profesional profesional = (Profesional) o;
        return Objects.equals(expedienteAcademico, profesional.expedienteAcademico) && Objects.equals(expedienteLaboral, profesional.expedienteLaboral);
    }
    @Override
    public String toString() {
        return "{" +
            " expedienteAcademico='" + getExpedienteAcademico() + "'" +
            ", expedienteLaboral='" + getExpedienteLaboral() + "'" +
            "}";
    }
}