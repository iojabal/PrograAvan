import PrograAvan.Lineal.Lista;

public class Campeonato {
    int tam;
    public Campeonato() {
        tam = 0;
    }

    Lista<JudoKa> listInscritos = new Lista<>();
    RounRobin rb;
    public void registrarJudokas(JudoKa jdk){
        listInscritos.insertar(jdk);
        tam++;
    }


    public void realizar_sorteo(){
        if(tam <= 6){
            rb = new RounRobin(tam);
            for(int i = 0; i < tam; i++){
                rb.meterJudokas(listInscritos.sacarUnoaUno());
            }
            rb.combinar();
            rb.mostrar();
        }else{
            //llaves eliminacion
            System.out.println("Aqui deberia ir el torneo por llaves");
            if(tam % 2 == 0){
                System.out.println("Comienza el torneo");
                //aqui debe ir la funcion de torneo por llaves;
            }else{
                System.out.println("se esta agregando luchador by hasta para tener un numero par de participantes");
                //aqui debe ir la funcion de torneo por llaves;
            }
        }
    }
}
