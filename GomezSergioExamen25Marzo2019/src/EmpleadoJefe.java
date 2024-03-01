public class EmpleadoJefe extends Empleado{
    private final int SUBORDINADOS_MAXIMOS = 12;
    private String departamento;
	private String subordinados;
    private String dni;
	private String nombre;
	private int sueldo;

    public EmpleadoJefe(String dni, String nombre, int sueldo, String departamento, String subordinados) throws EmpresaException{
        super(dni, nombre, sueldo);
        this.departamento = departamento;
    }

    public void AnnadirEmpleados(String dni){
        
    } 

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(String subordinados) {
        this.subordinados = subordinados;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
