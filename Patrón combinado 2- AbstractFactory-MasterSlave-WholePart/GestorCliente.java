class GestorCliente{
    public Empleado getEmpleado(String nombre){
        FabricaEmpleados fabricaEmpleados = new FabricaEmpleados();
        Empleado empleado = null;
        empleado = fabricaEmpleados.getEmpleado(nombre);
        return empleado;
    }

    public PacienteGeneral getPacienteGeneral(String nombre, float peso, float IMC, float estatura){
        FabricaPacientesMaster fabricaPacientes = new FabricaPacientesMaster();
        PacienteGeneral paciente = null;
        paciente = fabricaPacientes.getPacienteGeneral(nombre, peso, IMC, estatura);
        return paciente;
    }

    public PacienteObstetricia getPacienteObstetricia(String nombre, float peso, float IMC, float estatura, int semanasDeGestacion){
        FabricaPacientesMaster fabricaPacientes = new FabricaPacientesMaster();
        PacienteObstetricia paciente = null;
        paciente = fabricaPacientes.getPacienteObstetricia(nombre, peso, IMC, estatura, semanasDeGestacion);
        return paciente;
    }

    public PacientePediatria getPacientePediatria(String nombre, float peso, float IMC, float estatura, String tutor){
        FabricaPacientesMaster fabricaPacientes = new FabricaPacientesMaster();
        PacientePediatria paciente = null;
        paciente = fabricaPacientes.getPacientePediatria(nombre, peso, IMC, estatura, tutor);
        return paciente;
    }
}