package PrograAvan.NoLineal;

public class ArbolBinario<Llave extends Comparable<Llave>, Valor> {
    private class Nodo{
        private Llave llave;
        private Valor valor;
        private Nodo enlaceIzquierdo;
        private Nodo enlaceDerecho;
        private int tam;

        public Nodo(Llave llave, Valor valor, int tam) {
            this.llave = llave;
            this.valor = valor;
            this.tam = tam;
        }
    }
    private Nodo raiz;

    public ArbolBinario(){

    }
    public boolean estavacio(){
        return raiz == null;
    }
    public int get_tam(){
        return get_tam(raiz);
    }

    public int get_tam(Nodo x){
        if(x == null) return 0;
        return x.tam;
    }
    public Valor getElement_by_Llave(Llave l){
        return getElement_by_Llave(raiz, l);
    }

    public Valor getElement_by_Llave(Nodo x, Llave l) {
        if (x == null) return null;
        int cmp = l.compareTo(x.llave);
        if (cmp < 0) return getElement_by_Llave(x.enlaceIzquierdo, l);
        else if (cmp > 0) return getElement_by_Llave(x.enlaceDerecho, l);
        else return x.valor;
    }
    public void insertar(Llave l, Valor v){
        raiz  =  insertar(raiz, l, v);
    }

    private Nodo insertar(Nodo x, Llave l, Valor v){
        if(x == null) return new Nodo(l, v, 1);
        int cmp = l.compareTo(x.llave);
        if(cmp < 0){
            x.enlaceIzquierdo = insertar(x.enlaceIzquierdo, l, v);
        }else if(cmp > 0){
            x.enlaceDerecho = insertar(x.enlaceDerecho, l, v);
        }else{
            throw new IllegalArgumentException();
        }
        x.tam = 1 + get_tam(x.enlaceIzquierdo) + get_tam(x.enlaceDerecho);
        return x;
    }



}
