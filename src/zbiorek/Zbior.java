/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zbiorek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kamil
 */
public class Zbior implements IZbior{
 int ile = 0;
    int tab[] = new int[1000];
  
    @Override
   public void wczytaj(String filename) {
        int liczba;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String linia = br.readLine();
            while (linia != null) {
                liczba = Integer.parseInt(linia);
                if (czyZawiera(liczba) == false) {
                    dodaj(liczba);
                }
                linia = br.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Zbior.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void wypisz() {
        System.out.print("Elementy zbioru: ");
       for(int i =0;i<tab.length;i++){
           System.out.print(tab[i] + ", ");
       }
    }

    @Override
    public void dodaj(int nowy) {
        Boolean check=false;
          for(int i=0;i<tab.length;i++){
              if(nowy==tab[i]){
                  check=true;
                  break;
              }
          }
          if(check==false){
              tab[ile]= nowy;
              ile++;
          }
    }

    @Override
    public void usun(int element) {
        for(int i=0;i<tab.length;i++){
            if(element==tab[i]){
                tab[i]=0;
                ile--;
            }
        }
        for(int i = 0; i < tab.length - 1; i++) {
for(int j = 0; j < tab.length - 1; j++) {
if(tab[j] < tab[j + 1]) {
swap(tab, j, j + 1);
}
}
}
    }

    @Override
    public boolean czyZawiera(int element) {
       for(int i=0;i<tab.length;i++){
           if(element==tab[i]){
               return true;
           }
       }
    return false;
               
    }

    @Override
    public boolean czyRowne(IZbior drugi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IZbior suma(IZbior drugi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IZbior roznica(IZbior drugi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IZbior przeciecie(IZbior drugi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IZbior roznicaSymetryczna(IZbior drugi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static void swap(int[] tablica, int i, int j) {
int temp = tablica[i];
tablica[i] = tablica[j];
tablica[j] = temp;
}
    
}
