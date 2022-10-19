package PrograAvan.Lineal;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Cola<T> implements Iterable<T>{
    private T item;
    private Node<T> ultimo;
    private Node<T> primero;
    private int tam;

    public Cola(){
        primero = null;
        ultimo = null;
        tam = 0;
    }

    public boolean estaVacio(){
        return primero == null;
    }
    public void encolar(T item){
        Node<T> ultimo_anterior = ultimo;
        ultimo = new Node();
        ultimo.item = item;
        ultimo.enlace = null;

        if(estaVacio()){
            primero = ultimo;
        }else{
            ultimo_anterior.enlace = ultimo;
        }
        tam++;
    }

    public T desencolar(){
        if(estaVacio()){
            throw new NoSuchElementException("Error: Cola esta vacia");
        }
        T result = primero.item;
        primero = primero.enlace;
        tam--;
        if(estaVacio()){
            ultimo = null;
        }
        return result;
    }

    @Override
    public Iterator<T> iterator() {
        return new Cola_Iterator(primero);
    }

    private class Cola_Iterator implements Iterator<T>{
        private Node<T> actual;

        public  Cola_Iterator(Node<T> actual){
            this.actual = actual;
        }

        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public T next() {
            if(!hasNext()){
                throw  new NoSuchElementException();
            }
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
