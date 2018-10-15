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
public class Lista<T> {
  private Gen first;

    public Lista() {
        
    }

    public Gen getFirst() {
        return first;
    }

    public void setFirst(Gen first) {
        this.first = first;
    }
 
    public void insert(int data){
        Gen gen = new Gen();
        gen.setDane(data);
        gen.setNext(null);
        
        if(first == null){
            first = gen;
        }
        else {
            Gen n = first;
            while(n.getNext()!=null){
                n = n.getNext();
             
            }
            n.setNext(gen);
        }
    }
    public void show(){
        Gen gen = first;
        while(gen.next!=null){
            System.out.print(gen.dane+", ");
            gen = gen.next;
        }
        System.out.print(gen.dane+", ");
    }
}
