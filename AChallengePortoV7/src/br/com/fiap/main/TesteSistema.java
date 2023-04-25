package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Bicicleta;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Contatos;
import br.com.fiap.beans.Documentos;
import br.com.fiap.beans.Endereço;
import br.com.fiap.beans.Modalidade;
import br.com.fiap.beans.Pagamento;
import br.com.fiap.beans.Seguro;
import br.com.fiap.beans.Sistema;

public class TesteSistema {
	// método static
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	static float racional(String j) {
		return Float.parseFloat(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		// intanciação dos objetos
		Sistema objSistema = new Sistema();
		// Cliente(String nome, int idade, String sexo, String estadoCivil, String nacionalidade, Documentos documentos, Contatos contatos)
		Cliente objCliente = new Cliente(texto("Digite seu nome completo: "),
				inteiro("Digite sua idade: "),
				texto("Digite seu sexo: "),
				texto("Digite seu estado civil: "),
				texto("Digite seu nacionalidade: "));
		// Documentos(String cpf, String rg, String cnh, String tituloEleitor)
		Documentos objDocumentos = new Documentos(texto("Digite seu CPF: "),
				texto("Digite seu RG: "),
				texto("Digite seu CNH: "),
				texto("Digite seu titulo de eleitor: "));
		// Contatos(String telefoneFixo, String telefoneCelular, String contatoPrincipal, String email)
		Contatos objContatos = new Contatos(texto("Digite seu telefone residencial: "),
				texto("Digite seu celular: "),
				texto("Digite seu contato principal: "),
				texto("Digite seu e-mail: "));
		// Endereço(String cep, String logradouro, int número, String bairro, String cidade, String estado)
		Endereço objEndereço = new Endereço(texto("Digite seu CEP: "),
				texto("Digite seu logradouro: "),
				inteiro("Digite seu número: "),
				texto("Digite seu bairro: "),
				texto("Digite seu cidade: "),
				texto("Digite seu estado: "));
		// Modalidade(String mountainBike, String urbana, String performance)
		Modalidade objModalidade = new Modalidade(texto("Modalidade MountainBike? Digite [s]im ou [n]ão: "),
				texto("Modalidade Urbana? Digite [s]im ou [n]ão: "),
				texto("Modalidade Performance? Digite [s]im ou [n]ão: "));
		// Bicicleta(String marca, String modelo, Float valor, int ano, String cor, String nf)
		Bicicleta objBicicleta = new Bicicleta(texto("Digite a marca da bicicleta: "),
				texto("Digite o modelo da bicicleta: "),
				racional(JOptionPane.showInputDialog("Digite o valor da bicicleta: ")),
				inteiro(JOptionPane.showInputDialog("Digite o ano da bicicleta: ")),
				texto("Digite a cor da bicicleta: "),
				texto("Digite a nota fiscal de compra da bicicleta: "));
		// Seguro(String pedalEssencial, String pedalLeve, String pedalElite)
		Seguro objSeguro = new Seguro(texto("Deseja o seguro Pedal Essencial? Digite [s]im ou [n]ão: "),
				texto("Deseja o seguro Pedal Leve? Digite [s]im ou [n]ão: "),
				texto("Deseja o seguro Pedal Elite? Digite [s]im ou [n]ão: "));
		// Pagamento(String boleto, String cartãoCrédito, String débitoAutomático)
		Pagamento objPagamento = new Pagamento(texto("A forma de pagamento será boleto? Digite [s]im ou [n]ão: "),
				texto("A forma de pagamento será no débito automático? Digite [s]im ou [n]ão: "),
				texto("A forma de pagamento será no cartão de crédito? Digite [s]im ou [n]ão: "));
		
		objSistema.setCliente(objCliente);
		objSistema.setEndereço(objEndereço);
		objSistema.setModalidade(objModalidade);
		objSistema.setBicicleta(objBicicleta);
		objSistema.setSeguro(objSeguro);
		objSistema.setPagamento(objPagamento);
		
		objCliente.setContatos(objContatos);
		objCliente.setDocumentos(objDocumentos);
		
		System.out.println("Informações obrigatórias para o seguro" +
		"\n\nNome Completo: " + objCliente.getNome() + "\nIdade: " + objCliente.getIdade() +
		"\nInforme seu sexo [m]asculino ou [f]eminino: " + objCliente.getSexo() + "\nEstado Civil: " + objCliente.getEstadoCivil() +
		"\n\nInformações do Endereço do Assegurado" + "\n\nCEP: " + objEndereço.getCep() +
		"\nLogradouro: " + objEndereço.getLogradouro() + "\nNúmero: " + objEndereço.getNúmero() +
		"\nBairro: " + objEndereço.getBairro() + "\nCidade: " + objEndereço.getCidade() + "\nEstado: " + objEndereço.getEstado() + 
		"\n\nContatos do Assegurado" + "\n\nTelefone Residencial: " + objCliente.getContatos().getTelefoneFixo() +
		"\nTelefone Celular: " + objCliente.getContatos().getTelefoneCelular() + "\nContato Principal: " + objCliente.getContatos().getContatoPrincipal() +
		"\nE-mail: " + objCliente.getContatos().getEmail() + 
		"\n\nDocumentação do Assegurado" + "\n\nCPF: " + objCliente.getDocumentos().getCpf() + 
		"\n\nRG: " + objCliente.getDocumentos().getRg() + "\nCNH: " + objCliente.getDocumentos().getCnh() + 
		"\n\nModalidade da Bicicleta" + "Modalidade MoutainBike? Digite [s]im ou [n]ão: " + objModalidade.getMountainBike() + 
		"\nModalidade Urbana? Digite [s]im ou [n]ão: " + objModalidade.getUrbana() + "\nModalidade Performace? Digite [s]im ou [n]ão: " + 
		"\n\nInformações da Bicicleta" + "\n\nMarca: " + objBicicleta.getMarca() + "\nModelo: " + objBicicleta.getModelo() + 
		"\nValor: " + objBicicleta.getValor() + "\nAno: " + objBicicleta.getAno() + "\nCor: " + objBicicleta.getCor() + "\nNota Fiscal: " + objBicicleta.getNf() + 
		"\n\nSeguro escolhido" + "\n\nDeseja o seguro Pedal Essencial? Digite [s]im ou [n]ão: " + objSeguro.getPedalEssencial() + 
		"\nDeseja o seguro Pedal Leve? Digite [s]im ou [n]ão: " + objSeguro.getPedalLeve() + 
		"\nDeseja o seguro Pedal Elite? Digite [s]im ou [n]ão: " + objSeguro.getPedalElite() + 
		"\n\nInformações de Pagamento" + "\n\nA forma de pagamento será boleto? Digite [s]im ou [n]ão: " + objPagamento.getBoleto() +
		"\nA forma de pagamento será débito automático? Digite [s]im ou [n]ão: " + objPagamento.getDébitoAutomático() + 
		"\nA forma de pagamento será no cartão de crédito? Digite [s]im ou [n]ão: " + objPagamento.getCartãoCrédito()
		);
		
	}

}
