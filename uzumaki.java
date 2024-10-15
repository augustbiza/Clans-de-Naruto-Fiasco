class uzumaki extends ninja {

    //atributos exclusivos dos uzumaki
        boolean sapo;

    //metodos exclusivos dos uzumaki

        public void invocarSapo() {
            if(sapo) {
                System.out.println("Sapo já foi invocado");
            }
            else {
                sapo = true;
                System.out.println("Invocando Sapo");
            }
        }

        public void aumentarChacra(double chacra){
            this.chacra = 10;
            System.out.println("Chacra Infinito");
        }

        //ataque basico com polimorfismo
        public void ataqueBasico(double chacra) {
            System.out.println("Jutsu Multi Clone das Sombras");
        }

        @Override
        public void ataqueEspecial() {
            System.out.println("Rasengan");
        }
}