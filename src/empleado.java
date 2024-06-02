abstract class Empleados {
    private String nombre;
    private String numeroIdentificacion;


     public Empleados(String nombre, String numeroIdentificacion){
        this.nombre=nombre;
        this.numeroIdentificacion=numeroIdentificacion;
    }
    public String getnombre(){
        return nombre;
    }
    public String getNumeroIdentificacion(){
        return numeroIdentificacion;
    }
    
    public abstract double calcularSalario();


    public double aumentarSalario(double porcentaje) {
        return calcularSalario() * (porcentaje/100) + calcularSalario();
    }
    protected abstract String getCargo();
}
