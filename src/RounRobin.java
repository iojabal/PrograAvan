public class RounRobin {
    int t;
     JudoKa[] judoKas;

    public RounRobin(int tam){
        t = 0;
        if(tam > 6){
            throw new ArrayIndexOutOfBoundsException("el round robin solo funciona con 5 o menos participantes");
        }
        else{
            judoKas = new JudoKa[tam];
        }
    }
    public void combinar(){
        JudoKa buffer = judoKas[judoKas.length-1];
        for (int i = judoKas.length-1; i > 1; i--){
            judoKas[i] = judoKas[i-1];
        }
        judoKas[1] = buffer;
    }

    public void mostrar(){
        for (int i = 0, j = judoKas.length-1; i<j; i++, j--) {
            System.out.println(judoKas[i]+" vs "+ judoKas[j]);
        }
    }

    public void meterJudokas(JudoKa jdk){
        meterJudokas(jdk, t);
        t++;
    }

    void meterJudokas(JudoKa jdk, int t){
        judoKas[t]= jdk;
    }
}
