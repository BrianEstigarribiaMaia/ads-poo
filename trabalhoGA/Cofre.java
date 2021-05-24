package br.com.ftec.poo.trabalhoga;

public class Cofre {

	public void autenticar(Autenticavel autenticavel){
		if(autenticavel.autenticar(autenticavel.pegarSehha())){
			System.out.println("Funcionario tem acesso ao cofre");
		}else{
			System.out.println("Funcionario não tem acesso ao cofre");
		}
	}
}
