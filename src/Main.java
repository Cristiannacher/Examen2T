public class Main {
    public static void main(String[] args) {

        Bicicleta bicicleta = new Bicicleta("Orbea rallon 15");

        bicicleta.setVelocidad(34);
        bicicleta.setPlato(1);
        bicicleta.setPiñon(4);
        System.out.println(bicicleta);

        bicicleta.acelerar();
        System.out.println(bicicleta);
        bicicleta.frenar();
        System.out.println(bicicleta);
        bicicleta.cambiarPlato(3);
        System.out.println(bicicleta);
        bicicleta.cambiarPiñon(6);
        System.out.println(bicicleta);
        bicicleta.parar();
        System.out.println(bicicleta);
    }
}
