class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Usuário ou senha inválidos.");
    }
}

class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean fazer_login(String usuario, String senha) throws LoginInvalidoException {
        if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
            return true;
        } else {
            throw new LoginInvalidoException();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Login login = new Login("usuario", "senha");

        try {
            if (login.fazer_login("usuario", "senha_correta")) {
                System.out.println("Login realizado com sucesso.");
            }
        } catch (LoginInvalidoException e) {
            System.out.println("Erro ao fazer login: " + e.getMessage());
        }
    }
}
