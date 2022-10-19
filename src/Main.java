import PrograAvan.Lineal.Lista;
import PrograAvan.Lineal.ordenamiento;

public class Main {
    public static void main(String[] args) {
        Municipio tarata = new Municipio("Tarata");
        Club dragones = new Club("Dragones", "Av. xx entre xxx");
        Club tigres = new Club("tigres", "Av. xx entre xxx");
        JudoKa juan = new JudoKa("Juan", "Valdez", "juan@jaun.com", 9516604, "12/03/2003", 'M', (float) 76.4);
        JudoKa Maria = new JudoKa("Maria", "Valdez", "Maria@jaun.com", 95163604, "12/03/2003", 'F', (float) 60.4);
        JudoKa Julio = new JudoKa("Julio", "Marquez", "Julio@jaun.com", 95163604, "12/03/2003", 'F', (float) 80.4);
        JudoKa Mora = new JudoKa("Mora", "Marquez", "Mora@jaun.com", 951363604, "12/03/2003", 'M', (float) 56.4);
        JudoKa maycol = new JudoKa("Maycol", "Marquez", "Mora@jaun.com", 951363604, "12/03/2003", 'M', (float) 79.3);
        JudoKa Miguel = new JudoKa("Miguel", "Mirdoaw", "Mora@jaun.com", 951363604, "12/03/2003", 'F', (float) 56.2);
        Campeonato cmp = new Campeonato();

//        tarata.registrarClub(dragones);
//        tarata.registrarClub(tigres);
//
//        dragones.regisrarJudoka(juan);
//        dragones.regisrarJudoka(Maria);
//        tigres.regisrarJudoka(Julio);
//        tigres.regisrarJudoka(Mora);
//
//
//        tarata.listClubMun();
//        System.out.println();
//        dragones.lisJudokaClub();
//        System.out.println();
//        tigres.lisJudokaClub();

        cmp.registrarJudokas(Maria);
        cmp.registrarJudokas(juan);
        cmp.registrarJudokas(Julio);
        cmp.registrarJudokas(Mora);
        cmp.registrarJudokas(maycol);
        cmp.registrarJudokas(Miguel);

        cmp.realizar_sorteo();

//        Lista<JudoKa> judoKaLista = new Lista<>();
//        judoKaLista.insertar(juan);
//        judoKaLista.insertar(Maria);
//        judoKaLista.insertar(Julio);
//        judoKaLista.insertar(Mora);


    }
}
