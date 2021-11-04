public class Animal {
    private String nombre;
    private String lugarOrigen;
    protected String color;

    public Animal(){}

    public Animal(String nombre, String lugarOrigen, String color){
        this.nombre=nombre;
        this.lugarOrigen=lugarOrigen;
        this.color=color;
    }

    public void hacerSonido(String sonido){
        System.out.println("Estoy haciendo un sonido"+sonido);
    }

    public void comer(){
        System.out.println("Estoy comiendo");;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getLugarOrigen(){
        return lugarOrigen;
    }
    public void setLugarOrigen(String lugarOrigen){
        this.lugarOrigen=lugarOrigen;
    }

    public String getcolor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    @Override
    public String toString(){
        return "Animal{Nombre="+nombre+" lugar="+lugarOrigen+" color="+color+" "; 
    }
}
