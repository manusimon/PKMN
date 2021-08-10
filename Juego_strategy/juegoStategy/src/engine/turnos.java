package engine;

import java.util.Scanner;

import recursos.personaje;

public class turnos {
    public boolean turnoAtaque(personaje pokemon, personaje enemigo) {

        Scanner sc = new Scanner(System.in);

        boolean victoria = false;
        int ataque;
        double value;

        while (pokemon.getVida() >= 0 || enemigo.getVida() >= 0) {

            System.out.println("Que movimiento realizara " + pokemon.getNombre() + " ?!");

            if (pokemon.getTipo() == "fuego") {
                System.out.println(" ___________________________");
                System.out.println("| [1]Llamarada |  [2]Curar  |");
                System.out.println("| --------------------------|");
                System.out.println("|  [3]Ascuas   | [4]Placaje |");

            }

            ataque = sc.nextInt();
            switch (ataque) {
                case 1:
                    value = pokemon.ataque_1(enemigo);
                    System.out.println("El daño realizado fue de: "+value);
                    break;
                case 2:
                    value = pokemon.ataque_2();
                    System.out.println(pokemon.getNombre()+" se recupero tiene "+value+" puntos de vida");
                    break;
                case 3:
                    value = pokemon.ataque_3(enemigo);
                    System.out.println("El daño realizado fue de: "+value);
                    break;
                case 4:
                    value = pokemon.ataque_4(enemigo);
                    System.out.println("El daño realizado fue de: "+value);
                    break;
                default:
                    System.out.println("Ataque invalido");
                    ataque = sc.nextInt();
                    break;

            }

            if(pokemon.getVida() <= 0 || enemigo.getVida() <= 0){
                victoria = true;
                break;
            }

        }

        return victoria;
    }

}
