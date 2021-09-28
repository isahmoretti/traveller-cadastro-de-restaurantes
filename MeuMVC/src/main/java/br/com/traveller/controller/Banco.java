package br.com.traveller.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import br.com.traveller.model.Restaurante;

public class Banco {

	private static List<Restaurante> listaRestaurantes = new ArrayList<Restaurante>();
	private static Integer chaveSequencial = 1;
	
	static {
		Restaurante restaurante1 = new Restaurante();
		restaurante1.setNome("Arturito");
		restaurante1.setAvaliacao("4,0");
		restaurante1.setDescricao("Restaurante da Paolla Carossella.");
		restaurante1.setTipoCozinha("Argentina");
		restaurante1.setId(01);
		restaurante1.setLocalizacao("R. Artur de Azevedo, 542 - Pinheiros, S�o Paulo - SP");
		restaurante1.setHorarioFuncionamento("De ter�a � s�bado: 12:00-15:00, 19:00-23:00 // domingos: 12:00-16:00");
		restaurante1.setSite("www.arturito.com.br");
		restaurante1.setId(chaveSequencial ++);
		
		Restaurante restaurante2 = new Restaurante();
		restaurante2.setNome("Coco Bambu Market Place");
		restaurante2.setAvaliacao("5,0");
		restaurante2.setDescricao("Rede cearense re�ne no card�pio o melhor da comida nordestina.");
		restaurante2.setTipoCozinha("Brasileira");
		restaurante2.setId(02);
		restaurante2.setLocalizacao("Avenida Doutor Chucri Zaidan, 902 Shopping Market Place, S�o Paulo");
		restaurante2.setHorarioFuncionamento("Segunda � Domingo: 12h00 �s 16h00 // 18h00 �s 22h00");
		restaurante2.setSite("www.cocobambu.com");
		restaurante2.setId(chaveSequencial ++);
		
		Restaurante restaurante3 = new Restaurante();
		restaurante3.setNome("Supra di Mauro Maia");
		restaurante3.setAvaliacao("3,0");
		restaurante3.setDescricao("O chef Mauro Maia recebe os clientes e faz sugest�es de pratos.");
		restaurante3.setTipoCozinha("Italiana");
		restaurante3.setId(03);
		restaurante3.setLocalizacao("Rua Leopoldo Couto de Magalh�es Junior, 681, Itaim Bibi, S�o Paulo");
		restaurante3.setHorarioFuncionamento("Ter�a � S�bado: 12:00-15:00// 19:30�23:00");
		restaurante3.setSite("www.supracucina.com.br");
		restaurante3.setId(chaveSequencial ++);
		
		Restaurante restaurante4 = new Restaurante();
		restaurante4.setNome("Bravo Bistr�");
		restaurante4.setAvaliacao("5,0");
		restaurante4.setDescricao("Restaurante acolhedor � luz de velas com coquet�is e cozinha cl�ssica.");
		restaurante4.setTipoCozinha("Francesa");
		restaurante4.setId(04);
		restaurante4.setLocalizacao("Rua dos Campineiros 501, S�o Paulo");
		restaurante4.setHorarioFuncionamento("Ter�a � Domingo: 11:00�22:00");
		restaurante4.setSite("www.bravobistro.com.br");
		restaurante4.setId(chaveSequencial ++);
		
		listaRestaurantes.add(restaurante1);
		listaRestaurantes.add(restaurante2);
		listaRestaurantes.add(restaurante3);
		listaRestaurantes.add(restaurante4);
		
	}

	public List<Restaurante> getRestaurantes() {
		// TODO Auto-generated method stub
		return listaRestaurantes;
	}

	public void adiciona(Restaurante restaurante) {
		listaRestaurantes.add(restaurante);
		
	}

	public void remove(Integer id) {
		
		
		Iterator<Restaurante> it = listaRestaurantes.iterator();
		
		while (it.hasNext()) {
			Restaurante restaurante = (Restaurante) it.next();
			if(restaurante.getId()==id) {
				it.remove();
			}
			
			
		}
		
	}

	public Restaurante buscaPorId(Integer id) {
		
		for (Restaurante restaurante : listaRestaurantes) {
			if(restaurante.getId()==id) {
				return restaurante;
			}
		}
		return null;
		
	}

}
	
