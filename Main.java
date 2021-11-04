public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Gerente ger = new Gerente();
        System.out.println(ger);

        ger.setNombre("Romina Pérez");
        ger.setNumEmpleado(654789);
        ger.setSueldo(35_000);
        System.out.println(ger);
        System.out.println(ger.getNombre());
        ger.setPresupuesto(90_000);
        System.out.println(ger);

        Gerente ger2 = new Gerente("Samuel Torres",895632,15_000,25_000);
        System.out.println(ger2);

        Ballena ballena1 = new Ballena();
        ballena1.setNombre("Mobdick");
        System.out.println(ballena1.getNombre());

        Ballena ballena2 = new Ballena("Leonardo", "New Zeland", "Azul", 4, 34);
        System.out.println(ballena2);

        Perro perro1 = new Perro("Firulais", "Inglaterra", "Cafe", 4, "Rojo");
        System.out.println(perro1);

        Pajaro pajaro1 = new Pajaro("Lilo", "Amazonas", "Azul", 2, "Curvo");
        System.out.println(pajaro1);

        pajaro1.hacerSonido(" grrrrr");
    }
}