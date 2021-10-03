class CitaConsultaGeneral extends Cita{
    Medico medico;


    public CitaConsultaGeneral() {
    }
    public CitaConsultaGeneral(DatosPersonales datosPersonales, ExpedienteMedico expedienteMedico, Medico medico) {
        super(datosPersonales, expedienteMedico)
        this.medico = medico;
    }

    public Medico getMedico() {
        return this.medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CitaConsultaGeneral)) {
            return false;
        }
        CitaConsultaGeneral citaConsultaGeneral = (CitaConsultaGeneral) o;
        return Objects.equals(medico, citaConsultaGeneral.medico);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(medico);
    }

    @Override
    public String toString() {
        return "{" +
            " medico='" + getMedico() + "'" +
            "}";
    }

}