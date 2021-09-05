class GestorCitas(){
   
    public boolean generarCita(String nombreHospital, String nombrePaciente, Date fecha, String nombreMedico, String consultorio, float costo){
        Hospital hospital = obtenerDatosHospital(nombreHospital);
        DatosPersonales DP = obtenerDatosPersonales(nombrePaciente);
        ExpedienteMedico EM = obtenerExpedienteMedico(nombrePaciente);

        Cita cita = new Cita(Hospital, DP, EM, fecha, nombreMedico, consiltorio, costo);

        ProxyAutorizacionCitas proxyAutorizacionCitas = new ProxyAutorizacionCitas();
        boolean respuesta = proxyAutorizacionCitas.solicitarAutorizacion(cita);

        return respuesta;
    }

    private Hospital obtenerDatosHospital(String nombre){
        GestorHospital gestorHospital = new GestorHospital();
        Hospital hospital = gestorHospital.QueryHospital(nombre);
        return hospital;
    }
    private obtenerDatosPersonales(String nombrePaciente){
        GestorDatosPersonales gestorDatosPersonales = new GestorDatosPersonales();
        DatosPersonales datosPersonales = gestorDatosPersonales.QueryPaciente(nombre);
        return datosPersonales;
    }
    private obtenerExpedienteMedico(String nombrePaciente){
        GestorExpedienteMedico gestorExpedienteMedico = new GestorExpedienteMedico();
        ExpedienteMedico expedienteMedico = gestorExpedienteMedico.QueryExpedienteMedico(nombre);
        return expedienteMedico;
    }
}