public class Categoria{

    float peso;
    public Categoria(float peso) {
        this.peso = peso;
    }

    public String detCategoriaMasc(){
        if(peso <= 60){
            return "SuperLigero";
        }
        else if(peso > 60 && peso <= 66){
            return "SemiLigeros";
        }
        else if(peso > 66 & peso <73){
            return "Ligeros";
        }
        else if(peso > 73 && peso <= 81){
            return "SemiMedios";
        }
        else if(peso > 81 && peso <= 90){
            return "Medios";
        }
        else if(peso > 90 && peso <= 100){
            return "SemiPesados";
        }
        else{
            return "Pesados";
        }
    }

    public String detCategoriaFem(){
        if(peso <= 48){
            return "SuperLigero";
        }
        else if(peso > 48 && peso <= 52){
            return "SemiLigeros";
        }
        else if(peso > 52 & peso < 57){
            return "Ligeros";
        }
        else if(peso > 57 && peso <= 63){
            return "SemiMedios";
        }
        else if(peso > 63 && peso <= 70){
            return "Medios";
        }
        else if(peso > 70 && peso <= 78){
            return "SemiPesados";
        }
        else{
            return "Pesados";
        }
    }

}
