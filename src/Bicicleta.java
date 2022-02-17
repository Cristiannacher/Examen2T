public class Bicicleta {
    private String modelo;
    private double velocidad;
    private int plato;
    private int piñon;

    // pongo solo el modelo en el constructor ya que es el unico parametro
    // que no queremos que sea varibale (no quiereo decir que solo se puedan poner parametros)
    // no variables si no que asi luego (si no creo ningun setter ni getter) no se puede modificar.
    public Bicicleta(String modelo) {
        this.modelo = modelo;
    }

    //he creado el set para poder otorgar una velocidad incial a bicicleta
    //comprovando que los requisitos que pide el ejercicio sean los correctos(ya que lo he modificado)
    //i ademas poder modificarlo luego (no usando otro metodo claro)
    public void setVelocidad(double velocidad) {
        if (velocidad > 0 && velocidad <= 40)
            this.velocidad = velocidad;
        else System.out.println("no es un dato posible");
    }

    //he creado el set para poder otorgar un plato incial a bicicleta
    //comprovando que los requisitos que pide el ejercicio sean los correctos(ya que lo he modificado)
    //y ademas poder modificarlo luego (no usando otro metodo claro)
    public void setPlato(int plato) {
        if (plato >= 1 && plato <= 3)
            this.plato = plato;
        else System.out.println("no es un dato posible");
    }

    //he creado el set para poder otorgar un piñon incial a bicicleta
    //comprovando que los requisitos que pide el ejercicio sean los correctos(ya que lo he modificado)
    //i ademas poder modificarlo luego (no usando otro metodo claro)
    public void setPiñon(int piñon) {
        if (piñon >= 1 && piñon <= 7)
            this.piñon = piñon;
        else System.out.println("no es un dato posible");
    }
    //No te he puesto mas geters ni seters poque no se van ha utilizar en el ejercicio
    // pero haciendolo mas completo seria util tenner getters de la velocidad plato piñon
    // para poder luego trabajar con estos parametros.

    public void acelerar() {
        velocidad += 5;
    }

    public void frenar() {
        velocidad = velocidad / 2;
    }

    public void parar() {
        velocidad = 0;
    }


    public boolean cambiarPlato(int plato) {
        boolean cambiado = true;

        if (this.plato - plato == 1 || plato - this.plato == 1) {
            if(plato >= 1 && plato <=3) {
                this.plato = plato;
            }else cambiado = false;
        } else cambiado = false;

        return cambiado;
    }

    public boolean cambiarPiñon(int piñon){
        boolean cambiar = true;
        if (this.piñon - piñon == 1 || piñon - this.piñon == 1) {
            if (piñon >= 1 && piñon <= 7) {
                this.piñon = piñon;
            } else cambiar = false;
        } else cambiar = false;

        return cambiar;
    }

    @Override
    public String toString() {
        return "Bicicleta: " + modelo
                +", "
                + "velocidad: "
                + velocidad
                +"km/h, "
                + "Plato: "
                + plato
                +", "
                + "Piñon: "
                + piñon
                ;
    }
}
