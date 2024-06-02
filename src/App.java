public class App {
    public static void main(String[] args) throws Exception {

        Empleados[] empleados = new Empleados[2];

        empleados[0]=new empleadoTiempoCompleto("Fabiola", "0012510", 48000.0);
        empleados[1]=new empleadosMedioTiempo("Jairo", "0013010", 27,000 );
        empleados[2]=new empleadosMedioTiempo("Manuel", "0010912", 80,000 );
        

       for (int i= 0; i < empleados.length; i++) {
        System.out.println("Empleado:"+empleados[i].getnombre()+"salario mensual: $"+empleados[i].calcularSalario());

        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleado: " + empleados[i].getnombre());
            System.out.println("Cargo: " + empleados[i].getCargo());
            System.out.println("Identificacion: " + empleados[i].getNumeroIdentificacion());
            System.out.println("Salario: $ " + empleados[i].calcularSalario());
        }
 
 
 
    }
}    }





