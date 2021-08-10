package engine;

import recursos.charmander;

public class App {
    public static void main(String[] args) throws Exception {

        boolean fin;

        turnos t = new turnos();
        
        charmander c1 = new charmander("char", "fuego");
        charmander c2 = new charmander("rahc", "fuego");

        do{

            fin = t.turnoAtaque(c1, c2);

            if(!fin){
                fin = t.turnoAtaque(c2, c1);
            }

        }while(!fin);

        if(c1.getVida() <= 0){
            System.out.println(c1.getNombre()+" esta fuera de combate, "+c2.getNombre()+" es el ganador");
        }else if(c2.getVida() <= 0){
            System.out.println(c2.getNombre()+" esta fuera de combate, "+c1.getNombre()+" es el ganador");
        }
        


    }
}
