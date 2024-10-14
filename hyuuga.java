class hyuuga extends ninja {

    //atributos exclusivos dos hyuugas
    boolean byakugan;

    //metodos exclusivos dos hyuugas
    public void ativarByakugan() {
        if(byakugan) {
            System.out.println("Byakugan já está ativado");
        }
        else {
            System.out.println("Ativando byakugan");
            byakugan = true;
        }
    }
    public void desativarByakugan() {
        if(byakugan == true) {
            System.out.println("Desativando byakugan");
            byakugan = false;
        }
        else System.out.println("Byakugan já está desativado");
    }
}