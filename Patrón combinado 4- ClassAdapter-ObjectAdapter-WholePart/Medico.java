class Medico{
    DatosPersonales datosPersonales;
    String matricula;
    float salario;
    ExpedienteAcademico expedienteAcademico;
    ExpedienteLaboral expedienteLaboral;
    String adscripcion;
    String consultorio;

    public Medico() {
    }

    public Medico(DatosPersonales datosPersonales, String matricula, float salario, ExpedienteAcademico expedienteAcademico, 
    ExpedienteLaboral expedienteLaboral, String adscripcion, String consultorio) {
        this.datosPersonales = datosPersonales;
        this.matricula = matricula;
        this.salario = salario;
        this.expedienteAcademico = expedienteAcademico;
        this.expedienteLaboral = expedienteLaboral;
        this.adscripcion = adscripcion;
        this.consultorio = consultorio;
    }

    public DatosPersonales getDatosPersonales() {return this.datosPersonales;}
    public String getMatricula() {return this.matricula;}
    public float getSalario() {return this.salario;}
    public ExpedienteAcademico getExpedienteAcademico() {return this.expedienteAcademico;}
    public ExpedienteLaboral getExpedienteLaboral() {return this.expedienteLaboral;}
    public String getAdscripcion() {return this.adscripcion;}
    public String getConsultorio() {return this.consultorio;}

    public void setDatosPersonales(DatosPersonales datosPersonales) {this.datosPersonales = datosPersonales;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public void setSalario(float salario) {this.salario = salario;}
    public void setExpedienteAcademico(ExpedienteAcademico expedienteAcademico) {this.expedienteAcademico = expedienteAcademico;}
    public void setExpedienteLaboral(ExpedienteLaboral expedienteLaboral) {this.expedienteLaboral = expedienteLaboral;}
    public void setAdscripcion(String adscripcion) {this.adscripcion = adscripcion;}
    public void setConsultorio(String consultorio) {this.consultorio = consultorio;}

    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Medico)) {
            return false;
        }
        Medico medico = (Medico) o;
        return Objects.equals(datosPersonales, medico.datosPersonales) && Objects.equals(matricula, medico.matricula) && salario == medico.salario && Objects.equals(expedienteAcademico, medico.expedienteAcademico) && Objects.equals(expedienteLaboral, medico.expedienteLaboral) && Objects.equals(adscripcion, medico.adscripcion) && Objects.equals(consultorio, medico.consultorio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datosPersonales, matricula, salario, expedienteAcademico, expedienteLaboral, adscripcion, consultorio);
    }

    @Override
    public String toString() {
        return "{" +
            " datosPersonales='" + getDatosPersonales() + "'" +
            ", matricula='" + getMatricula() + "'" +
            ", salario='" + getSalario() + "'" +
            ", expedienteAcademico='" + getExpedienteAcademico() + "'" +
            ", expedienteLaboral='" + getExpedienteLaboral() + "'" +
            ", adscripcion='" + getAdscripcion() + "'" +
            ", consultorio='" + getConsultorio() + "'" +
            "}";
    }
}