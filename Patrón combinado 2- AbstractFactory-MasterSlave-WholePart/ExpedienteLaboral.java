class ExpedienteLaboral{
    private ArrayList<Documento> portafolio;
    private Documento avisoDePrivacidad;

    public ExpedienteLaboral() {}
    public ExpedienteLaboral(ArrayList<Documento> portafolio, Documento avisoDePrivacidad) {
        this.portafolio = portafolio;
        this.avisoDePrivacidad = avisoDePrivacidad;
    }

    public ArrayList<Documento> getPortafolio() {return this.portafolio;}
    public Documento getAvisoDePrivacidad() {return this.avisoDePrivacidad;}

    public void setPortafolio(ArrayList<Documento> portafolio) {this.portafolio = portafolio;}
    public void setAvisoDePrivacidad(Documento avisoDePrivacidad) {this.avisoDePrivacidad = avisoDePrivacidad;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ExpedienteLaboral)) {
            return false;
        }
        ExpedienteLaboral expedienteLaboral = (ExpedienteLaboral) o;
        return Objects.equals(portafolio, expedienteLaboral.portafolio) && Objects.equals(avisoDePrivacidad, expedienteLaboral.avisoDePrivacidad);
    }
    @Override
    public String toString() {
        return "{" +
            " portafolio='" + getPortafolio() + "'" +
            ", avisoDePrivacidad='" + getAvisoDePrivacidad() + "'" +
            "}";
    }
}