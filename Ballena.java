public class Ballena extends AnimalAcuatico {
    private int largo;

    public Ballena(){}

    public Ballena(String nombre, String lugarOrigen,String color,int numAletas,int largo){
        super(nombre, lugarOrigen, color, numAletas);
        this.largo=largo;

    }

    public void pelearConPinocho(){
        System.out.println("Estoy peleando con Pinocho");
    }
    @Override
    public void comer(){
        System.out.println("Estoy comiedo peces");;
    }

    public int getLargo(){
        return largo;
    }
    public void setLargo(int largo){
        this.largo=largo;
    }

    @Override
    public String toString(){
        return super.toString()+" largo="+largo+"}";
    }
}