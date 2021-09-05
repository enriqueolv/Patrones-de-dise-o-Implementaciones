class MedicoGeneral extends Profesional{
    private String adscripocion;
    private String consultorio;

    public MedicoGeneral() {}
    public MedicoGeneral(DatosPersonales datosPersonales, String matricula, float salario, ExpedienteAcademico expedienteAcademico, ExpedienteLaboral expedienteLaboral, 
    String adscripocion, String consultorio) {
        super(datosPersonales, matricula, salario, expedienteAcademico, expedienteLaboral);
        this.adscripocion = adscripocion;
        this.consultorio = consultorio;
    }

    public String getAdscripocion() {return this.adscripocion;}
    public String getConsultorio() {return this.consultorio;}

    public void setAdscripocion(String adscripocion) {this.adscripocion = adscripocion;}
    public void setConsultorio(String consultorio) {this.consultorio = consultorio;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MedicoGeneral)) {
            return false;
        }
        MedicoGeneral medicoGeneral = (MedicoGeneral) o;
        return Objects.equals(adscripocion, medicoGeneral.adscripocion) && Objects.equals(consultorio, medicoGeneral.consultorio);
    }
    @Override
    public String toString() {
        return "{" +
            " adscripocion='" + getAdscripocion() + "'" +
            ", consultorio='" + getConsultorio() + "'" +
            "}";
    }
}