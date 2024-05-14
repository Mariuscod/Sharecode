/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameCommand;

/**
 *
 * @author V.Marius
 */
public class Help_Command {
    
    protected void help(){
        System.out.println("\t/help \t\tVisualizza la guida. Equivale a digitare --help o -h.\n");
        System.out.println("\t/gioca \t\tMostra il tavoliere con le pedine in posizione iniziale.\n");
        System.out.println("\t/vuoto \t\tMostra il tavoliere vuoto con la numerazione.");
        System.out.println("\t/tavoliere \tMostrare il tavoliere con le pedine e la numerazione.\n");
        System.out.println("\t/qualimosse\tMostra quali mosse sono disponibili per il giocatore di turno.\n");
        System.out.println("\t/abbandona\tPer abbandonare la partita.");
        System.out.println("\t/esci\t\tPer chiudere il gioco.\n");
    }
}
