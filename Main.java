/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GameCommand;

//import it.uniba.app.MenuAtaxx;
import java.util.Scanner;

/**
 *
 * @author V.Marius
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Help_Command helpC = new Help_Command();
        Scanner sc = new Scanner(System.in);
        MenuAtaxx menu = new MenuAtaxx();
        Gioca gioca = new Gioca();
        System.out.println("\n Premere 1 per comminciare / Preme 0 per uscire : \n --> ");
        int scelta = sc.nextInt();
        switch (scelta) {
            case 1:
            menu.Benvenuto();
            helpC.help();
            menu.menu();
                break;
            case 0:
            menu.arrivederci();
                break;
        }
        
    }
    
}
