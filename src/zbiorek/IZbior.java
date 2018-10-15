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
public interface IZbior {
 public void wczytaj(String filename);
 public void wypisz();
 public void dodaj(int nowy);
 public void usun(int element);
 public boolean czyZawiera(int element);
 public boolean czyRowne(IZbior drugi);
 public IZbior suma(IZbior drugi);
 public IZbior roznica(IZbior drugi);
 public IZbior przeciecie(IZbior drugi);
 public IZbior roznicaSymetryczna(IZbior drugi); 
}
