package view;

import model.pessoaFisica;

public class execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pessoaFisica pf = new pessoaFisica();
		
		pf.setCpf(45678901);
		
		System.out.println(pf.getCpf());
		//-----//
		pf.setEndereco("Rua Sonho Ga�cho");
		
		System.out.println(pf.getEndereco());
		//-----//
		
		pf.setBairro("Cidade AE Carvalho");
		
		System.out.println(pf.getBairro());
		//-----//
		pf.setCidade("S�o Paulo");
		
		System.out.println(pf.getCidade());
		//-----//
		pf.setEstado("SP");
		
		System.out.println(pf.getEstado());
		//-----//
		pf.setCep(01234567);
		
		System.out.println(pf.getCep());
		//-----//
		
		pf.setTelefone(87654321);
		
		System.out.println(pf.getTelefone());
		
	}

}
