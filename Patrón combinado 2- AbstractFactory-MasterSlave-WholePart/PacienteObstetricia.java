class PacienteObstetricia extends Paciente{
    private int semanasDeGestacion;

    public PacienteObstetricia() {}
    public PacienteObstetricia(DatosPersonales datosPersonales, float peso, float IMC, float estatura, ExpedienteMedico expedienteMedico, HistorialDeTransacciones historialDeTransacciones, 
    int semanasDeGestacion) {
        super(datorPersonales, peso, IMC, estatura, expedienteMedico, historialDeTransacciones);
        this.semanasDeGestacion = semanasDeGestacion;
    }

    public int getSemanasDeGestacion() {return this.semanasDeGestacion;}

    public void setSemanasDeGestacion(int semanasDeGestacion) {this.semanasDeGestacion = semanasDeGestacion;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PacienteObstetricia)) {
            return false;
        }
        PacienteObstetricia pacienteObstetricia = (PacienteObstetricia) o;
        return semanasDeGestacion == pacienteObstetricia.semanasDeGestacion;
    }
    @Override
    public String toString() {
        return "{" +
            " semanasDeGestacion='" + getSemanasDeGestacion() + "'" +
            "}";
    }
}