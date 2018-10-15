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
public class Wezel <T>{
    private T dane;
    private Wezel next;

    public T getDane() {
        return dane;
    }

    public void setDane(T dane) {
        this.dane = dane;
    }

    public Wezel getNext() {
        return next;
    }

    public void setNext(Wezel next) {
        this.next = next;
    }
    
}
