class Laboratorista{
    DatosPersonales datosPersonales;
    String matricula;
    float salario;
    String especialidad;
    String laboratorio;

    public Laboratorista() {
    }

    public Laboratorista(DatosPersonales datosPersonales, String matricula, float salario, String especialidad, String laboratorio) {
        this.datosPersonales = datosPersonales;
        this.matricula = matricula;
        this.salario = salario;
        this.especialidad = especialidad;
        this.laboratorio = laboratorio;
    }

    public DatosPersonales getDatosPersonales() {return this.datosPersonales;}
    public String getMatricula() {return this.matricula;}
    public float getSalario() {return this.salario;}
    public String getEspecialidad() {return this.especialidad;}
    public String getLaboratorio() {return this.laboratorio;}

    public void setDatosPersonales(DatosPersonales datosPersonales) {this.datosPersonales = datosPersonales;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public void setSalario(float salario) {this.salario = salario;}
    public void setEspecialidad(String especialidad) {this.especialidad = especialidad;}
    public void setLaboratorio(String laboratorio) {this.laboratorio = laboratorio;}
    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Laboratorista)) {
            return false;
        }
        Laboratorista laboratorista = (Laboratorista) o;
        return Objects.equals(datosPersonales, laboratorista.datosPersonales) && Objects.equals(matricula, laboratorista.matricula) && salario == laboratorista.salario && Objects.equals(especialidad, laboratorista.especialidad) && Objects.equals(laboratorio, laboratorista.laboratorio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datosPersonales, matricula, salario, especialidad, laboratorio);
    }

    @Override
    public String toString() {
        return "{" +
            " datosPersonales='" + getDatosPersonales() + "'" +
            ", matricula='" + getMatricula() + "'" +
            ", salario='" + getSalario() + "'" +
            ", especialidad='" + getEspecialidad() + "'" +
            ", laboratorio='" + getLaboratorio() + "'" +
            "}";
    }
}