public class Empleado extends Object {
    private String nombre;
    private int numEmpleado;
    private int sueldo;

    public Empleado(){}
    
    public Empleado(String nombre,int numEmpleado, int sueldo){//Sobrecarga
        this.nombre=nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo =sueldo;
    }

    public void aumentarSueldo(int porcentaje){
        sueldo *= (sueldo*porcentaje/100);
        //sueldo = sueldo +(sueldo *porcentaje/100)
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getNumEmpleado(){
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado){
        this.numEmpleado = numEmpleado;
    }

    public int getSueldo(){
        return sueldo;
    }

    public void setSueldo(int sueldo){
        if (sueldo>=0) {
            this.sueldo = sueldo;
        } else {
            Math.abs(sueldo);//this.sueldo=0;//Math.abs(sueldo);
        }
    }

    @Override
    public String toString(){
        return "Empleado{nombre= "+nombre+" numEmpleado= "+numEmpleado+" Sueldo= "+sueldo+"}";
    }
}
