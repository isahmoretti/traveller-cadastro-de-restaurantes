package br.com.traveller.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.traveller.model.Restaurante;

@WebServlet("/novoRestaurante")
public class NovoRestauranteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeRestaurante = request.getParameter("nome");
		
		Restaurante restaurante = new Restaurante();
		restaurante.setNome(nomeRestaurante);
		
		Banco banco = new Banco();
		banco.adiciona(restaurante);	
		
		String descricaoRestaurante = request.getParameter("descricao");
		restaurante.setDescricao(descricaoRestaurante);
		
		String notaRestaurante = request.getParameter("nota");
		restaurante.setAvaliacao(notaRestaurante);
		
		String tipoCozinha = request.getParameter("tipoCozinha");
		restaurante.setTipoCozinha(tipoCozinha);
		
		String horarioFuncionamento = request.getParameter("horarioFuncionamento");
		restaurante.setHorarioFuncionamento(horarioFuncionamento);
		
		String localizacao = request.getParameter("localizacao");
		restaurante.setLocalizacao(localizacao);
		
		String site = request.getParameter("site");
		restaurante.setSite(site);
		
		
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("O restaurante " + nomeRestaurante + " foi cadastrado com sucesso!");
		out.println("<a href=\"http://localhost:8080/MeuMVC/listaRestaurantes\">Ver lista de restaurantes</a>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
