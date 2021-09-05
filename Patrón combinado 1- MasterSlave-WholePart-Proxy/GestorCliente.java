class GestorCliente(){
    public boolean generarCita(String nombreHospital, String nombrePaciente, Date fecha, String nombreMedico, String consultorio, float costo){
        GestorCitas gestorCitas = new GestorCitas();
        boolean resultado = gestorCitas.generarCita(nombreHospital, nombrePaciente, fecha, nombreMedico, consultorio, costo);
        return resultado;
    }
}