package PrograAvan.Lineal;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Pila<T> implements Iterable {
    private T item;
    private Node<T> sig;
    private int tam;

    public Pila(){
        sig = null;
        tam = 0;
    }

    public boolean isEmpty(){
        return sig == null;
    }

    public void stack(T item){
       Node<T> Primero = sig;
        sig = new Node<>();
        sig.item = item;
        sig.enlace = Primero;
        tam++;
    }

    public T unstack(){
        T item = sig.item;
        sig = sig.enlace;
        tam--;
        return item;
    }

    @Override
    public Iterator iterator() {
        return new Pila_Iterator(sig);
    }

    private class Pila_Iterator implements  Iterator<T>{


        private Node<T> actual;
        public Pila_Iterator(Node<T> actual){
            this.actual = actual;
        }

        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public T next() {
            if(!hasNext())
                throw new NoSuchElementException("NO tiene mas Elementos");
            T item = actual.item;
            actual = actual.enlace;
            return item;
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }
    }
}
