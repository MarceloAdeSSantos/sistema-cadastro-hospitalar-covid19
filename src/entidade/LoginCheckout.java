package entidade;

public class LoginCheckout {

	private String usuario;
	private String senha;

	public LoginCheckout(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public boolean login() {

		if (this.usuario.equals("fernanda") && this.senha.equals("345306")) {
			return true;
		}

		else {
			return false;
		}
	}
}