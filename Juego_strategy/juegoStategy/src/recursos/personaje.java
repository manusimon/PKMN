package recursos;

public abstract class personaje {
    
    String nombre;
    String tipo;
    int vida;

    public personaje(String nombre, String tipo){

        this.nombre = nombre;
        this.tipo = tipo;

    }

    public String getNombre(){

        return nombre;

    }

    public void setVida(int vida){

        this.vida = vida;

    }

    public int getVida(){

        return vida;

    }

    public String getTipo() {

        return tipo;

    }

    /* Ataques Overrideables */

    public double ataque_1(personaje enemigo){

        return 0;

    }

    public int ataque_2(){

        return 0;

    }

    public double ataque_3(personaje enemigo){

        return 0;

    }

    public double ataque_4(personaje enemigo){

        return 0;

    }
  

}
