
class Main {

    public static void main(String args[]) {

        hyuuga neji = new hyuuga();
            neji.nome = "Hyuuga Neji";
            neji.aldeia = "Folha";
            neji.idade = 16;
            neji.chacra = 4.9;
            neji.biju = false;

        kazekage gaara = new kazekage();
            gaara.nome = "Kazekage Gaara";
            gaara.aldeia = "Areia";
            gaara.idade = 15;
            gaara.chacra = 8.4;
            gaara.biju = true;

        uchiha sasuke = new uchiha();
            sasuke.nome = "Uchiha Sasuke";
            sasuke.aldeia = "Folha";
            sasuke.idade = 14;
            sasuke.chacra = 4.3;
            sasuke.biju = false;

        
        //ataque basico
        //gaara.ataqueBasico();

        //biju
        //gaara.ativarBiju();

        //hyuuga
        neji.byakugan = true;
        neji.ativarByakugan();
        neji.desativarByakugan();


        //System.out.println(sasuke.nome + "\n" + sasuke.aldeia + "\n" + sasuke.idade + "\n" + sasuke.chacra + "\n" + sasuke.biju);

        //gaara.ativarBiju();
    }
    
}