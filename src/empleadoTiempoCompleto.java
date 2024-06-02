public class empleadoTiempoCompleto extends Empleados {

    private double salarioAnual;
    
    public empleadoTiempoCompleto(String nombre, String numeroIdentificacion, double salarioAnual){
        super(nombre, numeroIdentificacion);
        this.salarioAnual=salarioAnual;
    }
    @Override
    public double calcularSalario(){
        return salarioAnual/ 12; 
    }
    @Override
    protected String getCargo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCargo'");
    }
    
    

}