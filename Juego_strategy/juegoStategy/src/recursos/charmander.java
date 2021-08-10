package recursos;

public class charmander extends personaje{
    
    public charmander(String nombre, String tipo){

        super(nombre,tipo);
        super.setVida(1500);

    }

    @Override
    public double ataque_1(personaje enemigo){
        
        double damage = 300;

        if(enemigo.getTipo() == "Planta"){
            damage *= 2;
        }else if (enemigo.getTipo() == "Agua"){
            damage *= 0.5;
        }

        enemigo.vida = (int)(enemigo.getVida() - damage);

        return damage;

    }

    @Override
    public int ataque_2(){
        
        return vida = vida + 500;

    }

    @Override
    public double ataque_3(personaje enemigo){
        
        double damage = 600;

        if(enemigo.getTipo() == "Planta"){
            damage *= 2;
        }else if (enemigo.getTipo() == "Agua"){
            damage *= 0.5;
        }

        enemigo.vida = (int)(enemigo.getVida() - damage);

        return damage;

    }

    @Override
    public double ataque_4(personaje enemigo){
        
        double damage = 475;

        if(enemigo.getTipo() == "Planta"){
            damage *= 2;
        }else if (enemigo.getTipo() == "Agua"){
            damage *= 0.5;
        }

        enemigo.vida = (int)(enemigo.getVida() - damage);

        return damage;

    }

   


}
