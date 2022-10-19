import PrograAvan.Lineal.Lista;

public class Municipio {
    String nombre;

    Lista<Club> clubesMunicipio = new Lista<>();
    public Municipio(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public void registrarClub(Club clubMunicipio){
        clubesMunicipio.insertar(clubMunicipio);
    }
    public void listClubMun(){
        for(Club e : clubesMunicipio) {
            System.out.println(e);
        }
    }
}
