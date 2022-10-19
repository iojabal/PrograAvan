import PrograAvan.Lineal.Lista;

public class Club {
    String nombre;
    String direccion;

    Lista<JudoKa> judokasClub = new Lista<>();

    public Club(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Club{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public void regisrarJudoka(JudoKa jdk){
        judokasClub.insertar(jdk);
    }
    public void lisJudokaClub(){
        for(JudoKa e: judokasClub){
            System.out.println(e);
        }
    }
}
