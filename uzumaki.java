class uzumaki extends ninja {

    //atributos exclusivos dos uzumaki
        boolean sapo;

    //metodos exclusivos dos uzumaki
/*
        public void invocarSapo() {
            if(sapo) {
                System.out.println("")
            }
        }
*/
        public void aumentarChacra(double chacra){
            chacra = 10;
            System.out.println("Chacra Infinito ("+chacra+")");
        }

        @Override
        public void ataqueEspecial() {
            System.out.println("Rasengan");
        }
}