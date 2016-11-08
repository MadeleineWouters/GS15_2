import java.util.*;

/**
 * Created by Madeleine on 08/11/2016.
 */
public class Init {
    public static void main (String[] args){
        System.out.println("Selectionner votre fonction de chiffrement");
        System.out.println("Entrer 1 pour un chiffrement VCES");
        System.out.println("Entrer 2 pour un chiffreement RSA avec modules multiples");
        System.out.println("Entrer 3 pour une signature RSA avec modules multiples");
        System.out.println("Entrer 4 pour le déchiffrement RSA");
        System.out.println("Entrer 5 pour vérifier une signature RSA");

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        switch (choice){
            case "1":
                //renvoyer à la bonne méthode dans VCES
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            default:
                break;
        }
    }
}
