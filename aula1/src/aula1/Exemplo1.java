package aula1;

import javax.swing.JOptionPane;

public class Exemplo1 {
	
	void start(){
		Carro automovel = new Carro();
		automovel.cor = "vermelho";
		automovel.modelo = "van";
		automovel.placa = "pno-6528";
		automovel.ano = 2016;
		
		Carro automovel2 = new Carro();
		automovel2.cor = "preto";
		automovel2.modelo = "onix";
		automovel2.placa = "abc-7777";
		automovel2.ano = 1999;
		
		JOptionPane.showMessageDialog(null, automovel.toString() +"\n"+ automovel2.toString() );
	}

}
