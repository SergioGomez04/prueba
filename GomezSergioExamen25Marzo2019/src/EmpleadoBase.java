public class EmpleadoBase extends Empleado{
    private final String[] puestoValido = {"ADMINISTRATIVO","ADMINISTRATIVO","ADMINISTRATIVO"};
    private String puesto;
    private String dni;
	private String nombre;
	private int sueldo;

    public EmpleadoBase(String puesto, String dni, String nombre, int sueldo) throws EmpresaException {
        super(dni, nombre, sueldo);
        setPuesto(puesto);
    }
    
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) throws EmpresaException {
        boolean encontrado = false;
        for (int i = 0; i < puestoValido.length; i++) {
            if (puesto.equalsIgnoreCase(puestoValido[i])) {
                this.puesto = puesto;
                encontrado = true;
            }
        }
        if (!encontrado) {
            throw new EmpresaException("El puesto no existe");
        }
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
        switch (puesto.toUpperCase()) {
            case "ADMINISTRATIVO":
                    this.sueldo = 1150;
                break;
            case "OPERARIO":
                    this.sueldo = 1100;
                break;
            case "CONTABLE":
                    this.sueldo = 1350;
                break;
        }
    }
    
    
}
