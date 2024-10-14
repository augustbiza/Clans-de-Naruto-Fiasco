
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

/*
        //ataque basico
        neji.ataqueBasico();
        gaara.ataqueBasico();
        sasuke.ataqueBasico();

        //biju
        neji.ativarBiju();
        gaara.ativarBiju();
        sasuke.ativarBiju();
        

       //uchiha
       sasuke.sharingan = false;
       sasuke.ativarSharingan();
       sasuke.nivelSharingan = 3;
       sasuke.ativarMangekyo();
       sasuke.desativarMangekyo();
       sasuke.desativarSharingan();

       //hyuuga
       neji.byakugan = false;
       neji.ativarByakugan();
       neji.desativarByakugan();

        //uzumaki
        System.out.println(naruto.chacra);
        naruto.aumentarChacra(naruto.chacra);

*/
        //ataque especial
        naruto.ataqueEspecial();
        sasuke.ataqueEspecial();
        neji.ataqueEspecial();


    }
    
}