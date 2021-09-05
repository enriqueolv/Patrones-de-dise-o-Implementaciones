import java.util.ArrayList;

class ExpedienteAcademico{
    private Documento cedulaProfesional;
    private Documento titulo;
    private ArrayList<Documento> diplomados;

    public ExpedienteAcademico() {}
    public ExpedienteAcademico(Documento cedulaProfesional, Documento titulo, ArrayList<Documento> diplomados) {
        this.cedulaProfesional = cedulaProfesional;
        this.titulo = titulo;
        this.diplomados = diplomados;
    }

    public Documento getCedulaProfesional() {return this.cedulaProfesional;}
    public Documento getTitulo() {return this.titulo;}
    public ArrayList<Documento> getDiplomados() {return this.diplomados;}

    public void setCedulaProfesional(Documento cedulaProfesional) {this.cedulaProfesional = cedulaProfesional;}
    public void setTitulo(Documento titulo) {this.titulo = titulo;}
    public void setDiplomados(ArrayList<Documento> diplomados) {this.diplomados = diplomados;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ExpedienteAcademico)) {
            return false;
        }
        ExpedienteAcademico expedienteAcademico = (ExpedienteAcademico) o;
        return Objects.equals(cedulaProfesional, expedienteAcademico.cedulaProfesional) && Objects.equals(titulo, expedienteAcademico.titulo) && Objects.equals(diplomados, expedienteAcademico.diplomados);
    }
    @Override
    public String toString() {
        return "{" +
            " cedulaProfesional='" + getCedulaProfesional() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", diplomados='" + getDiplomados() + "'" +
            "}";
    }
}