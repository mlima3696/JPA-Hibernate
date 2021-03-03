package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity // Para criar a tabela no banco
public class TelefoneUser {

	@Id // Vai ser o ID PrimaryKey
	@GeneratedValue(strategy = GenerationType.AUTO) // Automatico do banco
	private long id;
	
	@Column(nullable = false)
	private String tipo;
	
	@Column(nullable = false) // Tornar o campo obrigatorio
	private String numero;
	
	@ManyToOne(optional = false,fetch = FetchType.EAGER) // Muitos telefones para um usuario
	private UsuarioPessoa usuarioPessoa;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public UsuarioPessoa getUsuarioPessoa() {
		return usuarioPessoa;
	}

	public void setUsuarioPessoa(UsuarioPessoa usuarioPessoa) {
		this.usuarioPessoa = usuarioPessoa;
	}
	
}
