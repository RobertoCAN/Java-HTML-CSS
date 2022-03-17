package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//oi
//@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		PrintWriter saida = resp.getWriter();
		saida.println("<html>");
		saida.println("<body>");
		saida.println("oi munfo, parabéns vc que escreveu o primeiro servelet");
		saida.println("</body>");
		saida.println("</html>");
		
		
	}
	
}
