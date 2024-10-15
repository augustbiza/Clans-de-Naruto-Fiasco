#  Aprendendo POO Java com NARUTO


Detalhes sobre a Orientação por Objetos(em Java):

**Classe Pai:** ninja
**Classes filhas de "ninja":** uchiha, uzumaki e hyuuga




**HERANÇA:** classe filha que herda características da classe pai

	class uchiha extends ninja {

		//atributos e métodos específicos da classe uchiha
	}

Contexto: subclasse "uchiha" herda todos os atributos presentes na classe "ninja"





**@override:** usado para identificar métodos presente tanto na classe pai quanto nas classes filhas. Porém, em cada classe a função desse método varia

	class ninja {
		ataqueEspecial(){}
	}

	class uchiha extends ninja {
		ataqueEspecial() {
	   		System.out.println("Chidori");
		}
	}

	class uzumaki extends ninja {
		ataqueEspecial() {
	   		System.out.println("Rasengan");
		}
	}

Contexto: o método "ataqueEspecial" está presente na classe pai e individualmente nas classes filhas. Na classe "uchiha" ela ativa o 'chidori', já na classe "uzumaki" ela ativa o 'rasengan' 




**POLIMORFISMO:** métodos com mesmo nome são diferenciados pelos parâmetros que recebem

	public void ataqueBasico() {
        	System.out.println("Lançar kunai");
    	}

	public void ataqueBasico(double chacra) {
        	if(chacra > 7) {
            		if(sharingan == false) sharingan = true;
            		System.out.println("Copiando jutsu do adversário com o sharingan");
        	}
        	else System.out.println("Antecipando ataques dos inimigos com o sharingan");
    		}

Contexto: 
     1 caso: sasuke.ataqueBasico()
	o método a ser ativado será o primeiro("Lançar kunai"), pois não houve passagem de parâmetro

     2 caso: sasuke.ataqueBasico(5.7)
	o método a ser ativado será o segundo("Antecipando ataques dos inimigos com o sharingan"), pois houve a passagem de parâmetro(double = 5.7) e 5.7 < 7




**THIS.VARIAVEL:** utilizado para mudar valor de um atributo do objeto atual

    class Main {
        uzumaki naruto = new uzumaki();
        naruto.chacra = 5;
    }

	public void aumentarChacra(double chacra){
            this.chacra = 10;
            System.out.println("Chacra Infinito");
        }
Contexto: o chacra do "naruto" que era '5' passa a ser '10';
