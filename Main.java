
class Main {

    public static void main(String args[]) {

        //obj 1
        hyuuga neji = new hyuuga();
            neji.nome = "Hyuuga Neji";
            neji.aldeia = "Folha";
            neji.idade = 16;
            neji.chacra = 4.9;
            neji.biju = false;
        
        //obj 2
        uzumaki naruto = new uzumaki();
            naruto.nome = "Uzumaki Naruto";
            naruto.aldeia = "Folha";
            naruto.idade = 14;
            naruto.chacra = 5;
            naruto.biju = true;

        //obj 3
        uchiha sasuke = new uchiha();
            sasuke.nome = "Uchiha Sasuke";
            sasuke.aldeia = "Folha";
            sasuke.idade = 14;
            sasuke.chacra = 4.3;
            sasuke.biju = false;

        

        //uchiha
        sasuke.ataqueBasico();

        sasuke.ataqueBasico(sasuke.chacra);

        sasuke.ataqueEspecial();

        sasuke.ativarBiju();

        sasuke.sharingan = false;
        sasuke.ativarSharingan();
        sasuke.nivelSharingan = 3;
        sasuke.ativarMangekyo();
        sasuke.desativarMangekyo();
        sasuke.desativarSharingan();

        //hyuuga
        neji.ataqueBasico();

        neji.ataqueBasico(neji.chacra);

        neji.ataqueEspecial();

        neji.ativarBiju();

        neji.byakugan = false;
        neji.ativarByakugan();
        neji.desativarByakugan();

        //uzumaki
        naruto.ataqueBasico();

        naruto.ataqueBasico(naruto.chacra);

        naruto.ataqueEspecial();

        naruto.ativarBiju();
        //System.out.println(naruto.chacra);

        naruto.aumentarChacra(naruto.chacra);
        //System.out.println(naruto.chacra);

        naruto.ativarBiju();
        //System.out.println(naruto.chacra);


    }
    
}