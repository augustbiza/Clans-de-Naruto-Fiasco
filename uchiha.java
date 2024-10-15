class uchiha extends ninja{

    //atibutos exclusivos de uchihas
    boolean sharingan;      //estou considerando que todos os uchihas possuem sharingan
    int nivelSharingan;
    boolean mangekyo;       //para ativar o mangekyo é preciso ter sharingan nível 3

    //metodos exclusivos de uchihas

        //sharingan
    public void ativarSharingan() {
        if(sharingan) {
            System.out.println("Sharingan já está ativado");
        }
        else {
            System.out.println("Ativando sharingan");
            sharingan = true;
        }
    }

    public void desativarSharingan() {
        if(sharingan) {
            System.out.println("Desativando sharingan");
            sharingan = false;
        }
        else System.out.println("Sharingan já está desativado");
    }

    public void ativarMangekyo() {
        if(nivelSharingan == 3) {
            System.out.println("Ativando Mangekyo Sharingan");
            mangekyo = true;
        }
        else System.out.println("Não possui Mangekyo Sharingan");
    }

    public void desativarMangekyo() {
        if(nivelSharingan == 3) System.out.println("Desativando Mangekyo Sharingan");
        else System.out.println("Não possui Mangekyo Sharingan");
    }

    //ataque basico com polimorfismo
    public void ataqueBasico(double chacra) {
        if(chacra > 7) {
            if(sharingan == false) sharingan = true;
            System.out.println("Copiando jutsu do adversário com o sharingan");
        }
        else System.out.println("Antecipando ataques dos inimigos com o sharingan");
    }

    @Override
    public void ataqueEspecial() {
            System.out.println("Chidori");
        }
}