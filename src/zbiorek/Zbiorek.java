/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zbiorek;

/**
 *
 * @author Kamil
 */
public class Zbiorek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Zbior zbior = new Zbior();
        zbior.wczytaj("liczby.txt");
        zbior.dodaj(5);
        zbior.dodaj(13);
        zbior.dodaj(33);
        zbior.wypisz();
        System.out.println("");
        zbior.usun(2);
        zbior.wypisz();
        System.out.println("");
        zbior.dodaj(6);
        zbior.wypisz();*/
        
        /*   Lista jakas = new Lista();
        jakas.insert(0);
        jakas.insert(1);
        jakas.insert(2);
        jakas.show();*/
        
        Jednokierunkowa <String> lista = new Jednokierunkowa<>();
        lista.insert("elo");
        lista.insert("elo1");
        lista.insert("elo2");
        lista.delete(0);
        lista.printAll();
        
        lista.printAt(1);
    }
    
}
