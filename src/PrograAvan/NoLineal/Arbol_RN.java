package PrograAvan.NoLineal;

import PrograAvan.Lineal.Pila;

public class Arbol_RN<Llave extends Comparable<Llave>, Valor> {
    private static final boolean ROJO = true;
    private static final boolean NEGRO = false;

    private Nodo raiz ;


    class Nodo{
        private final Llave llave;
        private final Valor valor;
        private Nodo izq;
        private Nodo der;
        private boolean color;
        private int tam;
        public Nodo(Llave l, Valor v, boolean color, int t){
            this.llave = l;
            this.valor = v;
            this.color = color;
            this.tam = t;
        }

    }

    public Arbol_RN() {
    }

    private boolean es_rojo(Nodo x){
        if(x == null){
            return NEGRO;
        }else{
            return x.color;
        }
    }
    public void insertar(Llave llave, Valor val){
        raiz = insertar(raiz, llave, val);
    }
    public Nodo insertar(Nodo x, Llave llave, Valor val){
        if(x == null){
            return new Nodo(llave, val, ROJO, 1);
        }
        int cmp = llave.compareTo(x.llave);
        if(cmp < 0){
            x.izq = insertar(x.izq, llave, val);
        } else{
            x.der = insertar(x.der, llave, val);
        }
        //verificar balanceado
        if(es_rojo(x.der) && !es_rojo(x.izq)){
            x = rotar_izq(x);
        }
        if(es_rojo(x.der ) && es_rojo(x.izq.izq)){
            x = rotar_der(x);
        }
        if(es_rojo(x.izq) && es_rojo(x.der)){
            cambio_color(x);
        }
        x.tam = get_tam(x.izq) + get_tam(x.der) + 1;
        return x;
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
        if (cmp < 0) return getElement_by_Llave(x.izq, l);
        else if (cmp > 0) return getElement_by_Llave(x.izq, l);
        else return x.valor;
    }

    private void cambio_color(Nodo x) {
        x.color = !x.color;
        x.der.color = !x.der.color;
        x.izq.color = !x.izq.color;

    }

    private Nodo rotar_der(Nodo x) {
        Nodo aux = x.izq;
        x.izq = aux.der;
        aux.der = x;
        aux.color = aux.der.color;
        aux.der.color = ROJO;
        aux.tam = x.tam;
        x.tam = get_tam(x.izq) + get_tam(x.der);
        return aux;
    }

    private Nodo rotar_izq(Nodo x) {
        Nodo aux = x.der;
        x.der = aux.izq;
        aux.izq = x;
        aux.color = aux.izq.color;
        aux.izq.color = ROJO;
        aux.tam = x.tam;
        x.tam = get_tam(x.izq) + get_tam(x.der) + 1;
        return x;
    }

    public void empilar(){
        Pila<Valor> pila = new Pila<>();
        pila.stack(raiz.valor);
        Valor a = pila.unstack();

    }
}
