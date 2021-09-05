class Paciente extends Persona{
    float peso;
    float IMC;
    float estatura;
    ExpedienteMedico expedienteMedico;
    HistorialDeTransacciones historialDeTransacciones;

    public Paciente() {}
    public Paciente(DatosPersonales datosPersonales, float peso, float IMC, float estatura, ExpedienteMedico expedienteMedico, HistorialDeTransacciones historialDeTransacciones) {
        super(datorPersonales);
        this.peso = peso;
        this.IMC = IMC;
        this.estatura = estatura;
        this.expedienteMedico = expedienteMedico;
        this.historialDeTransacciones = historialDeTransacciones;
    }

    public float getPeso() {return this.peso;}
    public float getIMC() {return this.IMC;}
    public float getEstatura() {return this.estatura;}
    public ExpedienteMedico getExpedienteMedico() {return this.expedienteMedico;}
    public HistorialDeTransacciones getHistorialDeTransacciones() {return this.historialDeTransacciones;}

    public void setPeso(float peso) {this.peso = peso;}
    public void setIMC(float IMC) {this.IMC = IMC;}
    public void setEstatura(float estatura) {this.estatura = estatura;}
    public void setExpedienteMedico(ExpedienteMedico expedienteMedico) {this.expedienteMedico = expedienteMedico;}
    public void setHistorialDeTransacciones(HistorialDeTransacciones historialDeTransacciones) {this.historialDeTransacciones = historialDeTransacciones;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Paciente)) {
            return false;
        }
        Paciente paciente = (Paciente) o;
        return peso == paciente.peso && IMC == paciente.IMC && estatura == paciente.estatura && Objects.equals(expedienteMedico, paciente.expedienteMedico) && 
        Objects.equals(historialDeTransacciones, paciente.historialDeTransacciones);
    }
    @Override
    public String toString() {
        return "{" +
            " peso='" + getPeso() + "'" +
            ", IMC='" + getIMC() + "'" +
            ", estatura='" + getEstatura() + "'" +
            ", expedienteMedico='" + getExpedienteMedico() + "'" +
            ", historialDeTransacciones='" + getHistorialDeTransacciones() + "'" +
            "}";
    }
}