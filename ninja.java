
class ninja {

    //atributos de todos os ninjas
    public String nome;
    public String aldeia;
    public int idade;
    public double chacra;   //0.5 a 10
    public boolean biju;

    //metodos de todos os ninjas
    public void ataqueBasico() {
        System.out.println("Lançar kunai");
    }

    public void ativarBiju() {
        if(biju) {
            if(chacra >= 7.5) System.out.println("Biju no comando");
            else System.out.println("Chachra insuficiente para liberar biju");
        }
        else System.out.println("Não tem biju");
    }

    public void ataqueEspecial() {
        //cada clan(separado por classes) possui um metodo ataqueEspecial diferente
        //qnd chamado esse metodo ele executará diferentes tarefas dependendo do clan(classe) chamado
    }

}
