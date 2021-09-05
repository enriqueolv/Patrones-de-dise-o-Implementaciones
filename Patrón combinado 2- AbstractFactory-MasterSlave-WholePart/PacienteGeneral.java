class PacienteGenral extends Paciente{
    public PacienteGenral() {
    }
    public PacienteGenral(DatosPersonales datosPersonales, float peso, float IMC, float estatura, ExpedienteMedico expedienteMedico, HistorialDeTransacciones historialDeTransacciones) {
        super(datorPersonales, peso, IMC, estatura, ExpedienteMedico, historialDeTransacciones);
    }
}