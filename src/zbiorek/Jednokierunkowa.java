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
public class Jednokierunkowa<T>
{  
    private Wezel first;

    public Wezel getFirst() {
        return first;
    }

    public void setFirst(Wezel first) {
        this.first = first;
    }
    
    public void insert(T dane){
     Wezel <T> wezel = new Wezel<>();
     wezel.setDane(dane);
     wezel.setNext(null);
     if(first==null){
         first = wezel;
     }
     else {
         Wezel <T> bufor = first;
         while(bufor.getNext()!=null){
             bufor = bufor.getNext();
         }
         bufor.setNext(wezel);
     }
    }
    
    public void printAll(){
        Wezel<T> bufor = first;
        
        while(bufor.getNext()!=null){
            System.out.print(bufor.getDane()+ ",");
            bufor = bufor.getNext();
        }
        System.out.print(bufor.getDane()+ ",");
    }
    public void printAt(int index){
           Wezel<T> bufor = first;
           int licznik=0;
           while(bufor.getNext()!=null){
                
            if(licznik==index){
                 System.out.print(bufor.getDane()+ ",");
            }
          licznik++;
            bufor = bufor.getNext();
        }        
    }
    public void delete(int index){
        Wezel<T> bufor = first;
           int licznik=0;
           while(bufor.getNext()!=null){
                
            if(licznik==index){
               bufor.setDane(null);
            }
          licznik++;
            bufor = bufor.getNext();
        }        
    }
}
