import java.util.Date;


class Cita{
    private Hospital hospital;
    private DatosPersonales datorPaciente;
    private ExpedienteMedico expedintePaciente;
    private Date fecha;
    private String nombreMedico;
    private String consultorio;
    private float costo;

    Cita(Hospital h, DatosPersonales dp, ExpedienteMedico em, Date fecha, String medico, String consultorio, float costo){
        this.hospital = h;
        this.datorPaciente = dp;
        this.ExpedienteMedico = em;
        this.fecha = fecha;
        this.nombreMedico = medico;
        this.consultorio = consultorio;
        this.costo = costo;
    }

    public setHospital(Hospital hospital){this.hospital = hospital}
    public setDatosPaciente(DatosPersonales datosPaciente){this.datorPaciente = datorPaciente;}
    public setExpedintePaciente(ExpedienteMedico expedintePaciente){this.expedintePaciente = expedintePaciente;}
    public setFecha(Date fecha){this.fecha = fecha;}
    public setNombreMedico(String nombreMedico){this.nombreMedico = nombreMedico;}
    public setConsultorio(String consultorio){this.consultorio = consultorio;}
    public setCosto(float costo){this.costo = costo;}

    public Hospital getHospital(){return this.hospital;}
    public DatosPersonales getDatosPaciente(){return this.datorPaciente;}
    public ExpedinteMedico getExpedientePaciente(){return this.expedintePaciente;}
    public Date getFecha(){return this.fehca;}
    public String getNombreMedico(){return this.nombreMedico;}
    public String getConsultorio(){return this.consultorio;}
    public float getCosto(){return this.costo;}
}