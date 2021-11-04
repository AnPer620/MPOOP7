public class Pajaro extends Animal {
    private String tipoPico;

    public Pajaro(){}

    public Pajaro(String nombre, String lugarOrigen,String color,int numAlas, String tipoPico){
        super(nombre, lugarOrigen, color);
        this.tipoPico=tipoPico;
    }

    public void recolectarRamas(){
        System.out.println("Estoy recolectando ramas");
    }

    public String getTipoPico(){
        return tipoPico;
    }

    public void setIpoPico(String tipoPico){
        this.tipoPico=tipoPico;
    }

    @Override
    public String toString(){
        return super.toString()+"Tipo de pico="+tipoPico+"}";
    }
}