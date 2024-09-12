import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Usuário e senha de exemplo
    private final String USERNAME = "admin";
    private final String PASSWORD = "12345";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Recebendo os dados do formulário
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        // Verificação simples de usuário e senha
        if (USERNAME.equals(user) && PASSWORD.equals(pass)) {
            response.setContentType("text/html");
            response.getWriter().println("<h3>Login realizado com sucesso!</h3>");
            response.getWriter().println("<p>Bem-vindo, " + user + "!</p>");
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<h3>Falha no login!</h3>");
            response.getWriter().println("<p>Usuário ou senha inválidos. Tente novamente.</p>");
        }
    }
}
