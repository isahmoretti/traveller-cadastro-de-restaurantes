package br.com.traveller.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import br.com.traveller.model.Restaurante;


@WebServlet(name = "ListaRestaurantesServlet", urlPatterns = { "/listaRestaurantes" })
public class ListaRestaurantesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List <Restaurante> listaRestaurantes = banco.getRestaurantes();
		request.setAttribute("restaurantes", listaRestaurantes);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaRestaurantes.jsp");
		rd.forward(request, response);
		
	}

}
