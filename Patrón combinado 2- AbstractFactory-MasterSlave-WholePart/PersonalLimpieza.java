class PersonalLimpieza extends Empleado{
    private String adscripocion;
    private String sector;

    public PersonalLimpieza() {}
    public PersonalLimpieza(DatosPersonales datosPersonales, String matricula, float salario, String adscripocion, String sector) {
        super(DatosPersonales, matricula, salario);
        this.adscripocion = adscripocion;
        this.sector = sector;
    }

    public String getAdscripocion() {return this.adscripocion;}
    public String getSector() {return this.sector;}

    public void setAdscripocion(String adscripocion) {this.adscripocion = adscripocion;}
    public void setSector(String sector) {this.sector = sector;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PersonalLimpieza)) {
            return false;
        }
        PersonalLimpieza personalLimpieza = (PersonalLimpieza) o;
        return Objects.equals(adscripocion, personalLimpieza.adscripocion) && Objects.equals(sector, personalLimpieza.sector);
    }
    @Override
    public String toString() {
        return "{" +
            " adscripocion='" + getAdscripocion() + "'" +
            ", sector='" + getSector() + "'" +
            "}";
    }
}