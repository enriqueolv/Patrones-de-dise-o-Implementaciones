class FabricaEmpleados extends FabricaPersonas{
    public Empleado getEmpleado(String nombre){
        Empleado empleado = null;
        /*
        Proceso para definir el tipo
        de empleado y crearlo

        getDatosPersonales();
        getExpedienteAcademico();
        getExpedientLaboral();
         */
        return empleado;
    }

    private DatosPersonales getDatosPeronales(String nombre){
        DatosPersonales datosPersonales = null;
        /*
        Aceso a base de datos
        ...
        */
        return datosPersonales;
    }
    private ExpedienteAcademico getExpedienteAcademico(String nombre){
        ExpedienteAcademico expedienteAcademico = null;
        /*
        Aceso a base de datos
        ...
        */
        return expedienteAcademico;
    }
    private ExpedienteLaboral getExpedienteLaboral(String nombre){
        ExpedienteLaboral expedienteLaboral = null;
        /*
        Aceso a base de datos
        ...
        */
        return expedienteLaboral;
    }
}