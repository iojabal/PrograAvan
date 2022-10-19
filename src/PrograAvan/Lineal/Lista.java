package PrograAvan.Lineal;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Lista<T> implements Iterable<T>, Serializable {
    private int tam;
    private Node<T> cabeza;

    //constructor, inicia lista vacia (cabeza null)
    public Lista() {
        cabeza = null;
        tam = 0;
    }

    public int getTam() {
        return tam;
    }

    public boolean estaVacia(){
        return cabeza == null;
    }

    public void aniadir(T item){
        cabeza = aniadir(cabeza, item);
    }

    public Node<T> aniadir(Node<T> x, T item){
        if(x == null){
            x = new Node<>();
            x.item = item;
            x.enlace = null;
            tam++;
            return x;
        }
        x.enlace = aniadir(x.enlace, item);
        return x;
    }
    public void insertar(T item){
        Node antiguo = cabeza;
        cabeza = new Node();
        cabeza.item = item;
        cabeza.enlace = antiguo;
        tam++;
    }

    public T sacarUnoaUno(){
        T item = cabeza.item;
        cabeza = cabeza.enlace;
        tam--;
        return item;
    }
    public  void mostrar(){
        while(cabeza != null){
            System.out.println(cabeza.item);
            cabeza = cabeza.enlace;

        }
    }

    public T getFirstItem(){
        return cabeza.item;
    }

    public  T getLastItem(){
        while(cabeza.enlace != null){
            cabeza = cabeza.enlace;
        }
        return cabeza.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new Lista_Iterator(cabeza);
    }


    private class Lista_Iterator implements Iterator<T>{
        private  Node<T> actual;
        public Lista_Iterator(Node<T> primero){
            actual = primero;
        }

        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public T next() {
            if(!hasNext()){
                throw new NoSuchElementException();
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
