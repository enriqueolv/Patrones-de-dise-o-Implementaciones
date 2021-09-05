class PacientePediatria extends Paciente{
    private String tutor;

    public PacientePediatria() {}
    public PacientePediatria(DatosPersonales datosPersonales, float peso, float IMC, float estatura, ExpedienteMedico expedienteMedico, HistorialDeTransacciones historialDeTransacciones, 
    String tutor) {
        super(datorPersonales, peso, IMC, estatura, expedienteMedico, historialDeTransacciones);
        this.tutor = tutor;
    }

    public String getTutor() {return this.tutor;}

    public void setTutor(String tutor) {this.tutor = tutor;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PacientePediatria)) {
            return false;
        }
        PacientePediatria pacientePediatria = (PacientePediatria) o;
        return Objects.equals(tutor, pacientePediatria.tutor);
    }
    @Override
    public String toString() {
        return "{" +
            " tutor='" + getTutor() + "'" +
            "}";
    }
}