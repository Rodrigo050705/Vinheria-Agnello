package br.com.fiap.controller;
  
  import java.io.IOException;
  import javax.servlet.ServletException;
  import javax.servlet.annotation.WebServlet;
  import javax.servlet.http.HttpServlet;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse;
  
  import org.apache.catalina.connector.Request;
  
  
  @WebServlet("/vinheria")
  public class VinheriaServlet extends HttpServlet {
  
    private static final long serialVersionUID = 1L;
       
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //Recuperar os parâmetros do formulário HTML
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        
        //Exibe os valores no console do eclipse
        System.out.println(nome + " " + email + " " + senha);
        
        //Adiciona atributos no request para exibir na página
        request.setAttribute("nomeUser", nome);
        request.setAttribute("emailUser", email);
        request.setAttribute("senhaUser", senha);
        
        request.getRequestDispatcher("sucesso.jsp").forward(request, response);
    }
  
  }