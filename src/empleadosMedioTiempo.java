public class empleadosMedioTiempo extends Empleados {

    
    private double salarioporHora;
    private int horasTrabajadasporSemana;

    public empleadosMedioTiempo(String nombre, String numeroIdentificacion, double salarioporHora, int horasTrabajadasporSemana){
        super(nombre, numeroIdentificacion);
        this.salarioporHora= salarioporHora;
        this.horasTrabajadasporSemana=horasTrabajadasporSemana;
    }
     @Override
     public double calcularSalario(){
        return salarioporHora*horasTrabajadasporSemana*4;
     }
    @Override
    protected String getCargo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCargo'");
    }


}