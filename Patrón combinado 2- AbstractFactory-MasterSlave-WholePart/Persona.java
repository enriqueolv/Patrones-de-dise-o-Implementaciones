class Persona{
    private DatosPersonales datorPersonales;

    public Persona() {}
    public Persona(DatosPersonales datorPersonales) {
        this.datorPersonales = datorPersonales;
    }

    public DatosPersonales getDatorPersonales() {return this.datorPersonales;}

    public void setDatorPersonales(DatosPersonales datorPersonales) {this.datorPersonales = datorPersonales;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(datorPersonales, persona.datorPersonales);
    }
    @Override
    public String toString() {
        return "{" +
            " datorPersonales='" + getDatorPersonales() + "'" +
            "}";
    }
}