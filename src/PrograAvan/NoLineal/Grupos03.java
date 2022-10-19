package PrograAvan.NoLineal;

import java.util.Arrays;

public class Grupos03 {
    private int[] padres;
    private int num_grupos;
    private int size[];

    public Grupos03(int num_grupos) {
        this.num_grupos = num_grupos;
        padres = new int[num_grupos];
        size = new int[num_grupos];
        for(int i =0; i < num_grupos; i++) {
            padres[i] = i;
            size[i] = 1;
        }
    }

    public int get_grupos(int p){
        while(p != padres[p]){
            p = padres[p];
        }
        return p;
    }
    public boolean conectados(int p, int q){
        return get_grupos(p) == get_grupos(q);
    }

    @Override
    public String toString() {
        return "PrograAvan.Lineal.NoLineal.Grupos02{" +
                "padres=" + Arrays.toString(padres) +
                ", num_grupos=" + num_grupos +
                '}';
    }

    public void conectar(int p, int q){
        int pid = get_grupos(p);
        int qid = get_grupos(q);
        if(conectados(p, q) ) return;
        if(size[pid] < size[qid]){
            padres[pid] = qid;
            size[qid] += size[pid];
        }else{
            padres[qid] = pid;
            size[qid] += size[pid];
        }

        num_grupos--;
    }
}

