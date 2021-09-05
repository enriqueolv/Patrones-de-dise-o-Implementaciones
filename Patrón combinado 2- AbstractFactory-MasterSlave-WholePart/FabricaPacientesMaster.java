class FabricaPacientesMaster{
    public PacienteGeneral getPacienteGeneral(String nombre, float peso, float IMC, float estatura){
        GestorDatosPersonales gestorDatosPersonales = new GestorDatosPersonales();
        GestorExpedienteMedico gestorExpedienteMedico = new GestorExpedienteMedico();
        GestorHistorialDeTransacciones gestorHistorialDeTransaccioens = new GestorHistorialDeTransacciones();

        DatosPersonales datosPersonales = null;
        ExpedienteMedico expedienteMedico = null;
        HistorialDeTransacciones historialDeTransacciones = null;

        datosPersonales = gestorDatosPersonales.getDatosPeronales(nombre);
        expedienteMedico = gestorExpedienteMedico.getExpedienteMedico(nombre);
        historialDeTransacciones = gestorHistorialDeTransaccioens.getHistorialDeTransacciones(nombre);

        PacienteGenral paciente = new PacienteGenral(datosPersonales, peso, IMC, estatura, expedienteMedico, historialDeTransacciones);

        return paciente;
    }

    public PacienteGeneral getPacienteObtetricia(String nombre, float peso, float IMC, float estatura, int semanasDeGestacion){
        GestorDatosPersonales gestorDatosPersonales = new GestorDatosPersonales();
        GestorExpedienteMedico gestorExpedienteMedico = new GestorExpedienteMedico();
        GestorHistorialDeTransacciones gestorHistorialDeTransaccioens = new GestorHistorialDeTransacciones();

        DatosPersonales datosPersonales = null;
        ExpedienteMedico expedienteMedico = null;
        HistorialDeTransacciones historialDeTransacciones = null;

        datosPersonales = gestorDatosPersonales.getDatosPeronales(nombre);
        expedienteMedico = gestorExpedienteMedico.getExpedienteMedico(nombre);
        historialDeTransacciones = gestorHistorialDeTransaccioens.getHistorialDeTransacciones(nombre);

        PacienteGenral paciente = new PacienteGenral(datosPersonales, peso, IMC, estatura, expedienteMedico, historialDeTransacciones, semanasDeGestacion);

        return paciente;
    }

    public PacienteGeneral getPacientePediatria(String nombre, float peso, float IMC, float estatura, String tutor){
        GestorDatosPersonales gestorDatosPersonales = new GestorDatosPersonales();
        GestorExpedienteMedico gestorExpedienteMedico = new GestorExpedienteMedico();
        GestorHistorialDeTransacciones gestorHistorialDeTransaccioens = new GestorHistorialDeTransacciones();

        DatosPersonales datosPersonales = null;
        ExpedienteMedico expedienteMedico = null;
        HistorialDeTransacciones historialDeTransacciones = null;

        datosPersonales = gestorDatosPersonales.getDatosPeronales(nombre);
        expedienteMedico = gestorExpedienteMedico.getExpedienteMedico(nombre);
        historialDeTransacciones = gestorHistorialDeTransaccioens.getHistorialDeTransacciones(nombre);

        PacienteGenral paciente = new PacienteGenral(datosPersonales, peso, IMC, estatura, expedienteMedico, historialDeTransacciones, tutor);

        return paciente;
    }
}