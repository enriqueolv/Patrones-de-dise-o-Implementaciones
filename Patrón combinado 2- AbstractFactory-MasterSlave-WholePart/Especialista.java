class Especialista extends Profesional{
    private String adscripocion;
    private String especialidad;
    private String consultorio;

    public Especialista(){}
    public Especialista(DatosPersonales datosPersonales, String matricula, float salario, ExpedienteAcademico expedienteAcademico, ExpedienteLaboral expedienteLaboral, 
    String adscripocion, String especialidad, String consultorio) {
        super(datosPersonales, matricula, salario, expedienteAcademico, expedienteLaboral);
        this.adscripocion = adscripocion;
        this.especialidad = especialidad;
        this.consultorio = consultorio;
    }

    public String getAdscripocion() {return this.adscripocion;}
    public String getEspecialidad() {return this.especialidad;}
    public String getConsultorio() {return this.consultorio;}

    public void setAdscripocion(String adscripocion) {this.adscripocion = adscripocion;}  
    public void setEspecialidad(String especialidad) {this.especialidad = especialidad;}
    public void setConsultorio(String consultorio) {this.consultorio = consultorio;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Especialista)) {
            return false;
        }
        Especialista especialista = (Especialista) o;
        return Objects.equals(adscripocion, especialista.adscripocion) && Objects.equals(especialidad, especialista.especialidad) && Objects.equals(consultorio, especialista.consultorio);
    }
    @Override
    public String toString() {
        return "{" +
            " adscripocion='" + getAdscripocion() + "'" +
            ", especialidad='" + getEspecialidad() + "'" +
            ", consultorio='" + getConsultorio() + "'" +
            "}";
    }
}