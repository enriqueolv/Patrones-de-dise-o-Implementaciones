import import java.util.ArrayList;

class ExpedienteMedico{
    private String nombrePacientePropietario;
    private Documento historiaClinica;
    private Documento notaDeEvolucion;
    private Documento notaDeReferencia;
    private ArrayList<Documento> estudios;
    private ArrayList<Documento> citas;

    ExpedienteMedico(String nombrePacientePropietario, Documento historiaClinica, Documento notasDeEvolucion, 
                    Documento notasDeReferencia, ArrayList<Documento> estudios, ArrayList<Documento> citas){
        this.nombrePacientePropietario = nombrePacientePropietario;
        this.historiaClinica = historiaClinica;
        this.notasDeEvolucion = notasDeEvolucion;
        this.notasDeReferencia = notasDeReferencia;
        this.estudios = estudios;
        this.citas = citas;
    }

    public setNombrePacientePropietario(String setNombrePacientePropietario){this.nombrePacientePropietario = nombrePacientePropietario;}
    public setHistoriaClinica(Documento historiaClinica){this.historiaClinica = historiaClinica;}
    public setNotaDeEvolucion(Documento notaDeEvolucion){this.notaDeEvolucion = notaDeEvolucion;}
    public setNotaDeReferencia(Documento notaDeReferencia){this.notaDeReferencia = notaDeReferencia;}
    public setEstudios(ArrayList<Documento>){this.estudios = estudios;}
    public addEstudio(Documento estudio){this.estudios.add(estudio);}
    public removeEstudio(int numero){/*implementar*/}
    public setCitas(ArrayList<Documento>){this.citas = citas;}
    public addCita(Documento cita){this.citas.add(cita);}
    public removeCita(int numero){/*implementar*/}

    public String getNombrePacientePropietario(){return this.nombrePacientePropietario;}
    public Documento getHistoriaClinica(){return this.historiaClinica;}
    public Documento getNotaDeEvolucion(){return this.notaDeEvolucion;}
    public Documento getNotaDeReferencia(){return this.notaDeReferencia;}
    public ArrayList<Documento> getEstudios(){return this.estudios;}
    public ArrayList<Documento> getCitas(){return this.citas;}
}