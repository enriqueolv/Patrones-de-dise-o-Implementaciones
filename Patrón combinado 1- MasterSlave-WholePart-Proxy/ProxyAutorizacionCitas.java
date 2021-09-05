class ProxyAutorizacionCitas implements I_AutorizacionCitas{
    public boolean solicitarAutorizacion(Cita cita){
        SistemaAutorizaiconCitas sistema = new SistemaAutorizaiconCitas();
        boolean respuesta = sistema.solicitarAutorizacion(cita);
        return respuesta;
    }
}