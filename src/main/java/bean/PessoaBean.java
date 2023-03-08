package bean;

import javax.faces.bean.ManagedBean;

import bd.Banco;
import entidade.Pessoa;

@ManagedBean
public class PessoaBean {

	private Pessoa pessoa = new Pessoa();

	public String salvar() {
		Banco.salvar(pessoa);
		return null;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}	
}
