import PrograAvan.Lineal.Lista;

import java.util.Date;

public class JudoKa extends Persona implements Comparable{
    float pesoAct;
    String categoria;

    Lista<JudoKa> judoKaCategoria = new Lista<>();
    public JudoKa(String name, String lastName, String email, int ci, String fecha_nac, char genero, float pesoAct) {
        super(name, lastName, email, ci, fecha_nac, genero);
        Categoria ct = new Categoria(pesoAct);
        this.pesoAct = pesoAct;
        if(genero == 'M'){
            this.categoria = ct.detCategoriaMasc();
        }else{
            this.categoria = ct.detCategoriaFem();
        }
    }

    @Override
    public String toString() {
        return "JudoKa{" +
                "pesoAct=" + pesoAct +
                ", categoria='" + categoria + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", ci=" + ci +
                ", fecha_nac=" + fecha_nac +
                ", genero=" + genero +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        JudoKa otro = (JudoKa) o;
        if(otro.pesoAct > ((JudoKa) o).pesoAct){
            return 1;
        }else if(otro.pesoAct < ((JudoKa) o).pesoAct){
            return -1;
        }
        return 0;
    }
}
