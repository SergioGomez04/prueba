public class Principal {
    public static void main(String[] args) throws EmpresaException {
        Empleado[] misEmpleados = new Empleado[5];
        EmpleadoJefe jefe1 = new EmpleadoJefe(null, null, 0, null, null);
        EmpleadoBase base1 = new EmpleadoBase("administrativo", null, null, 1100);
        //TO DO crear array para añadir los empleados
        misEmpleados[1]= jefe1;
    }
}
