class MetodoPago {
    private String tipoTarjeta;
    private int ultimosCuatroDigitos;
    private String fechaVencimiento;

    // Constructor
    public MetodoPago(String tipoTarjeta, int ultimosCuatroDigitos, String fechaVencimiento) {
        this.tipoTarjeta = tipoTarjeta;
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
        this.fechaVencimiento = fechaVencimiento;
    }

    // Getters
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public int getUltimosCuatroDigitos() {
        return ultimosCuatroDigitos;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
}
