package med.voll.api.domain.usuario;

public record DadosAutenticacao(String login, String senha) {

	public Usuario toUsuario() {
		return new Usuario(this.login, this.senha);
	}
	
}
