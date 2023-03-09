package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import bd.Banco;
import entidade.Pessoa;

@ManagedBean
public class PessoaBean {

	private Pessoa pessoa = new Pessoa();
	private List<Pessoa> pessoas;

	public String salvar() {
		Banco.salvar(pessoa);
		pessoa = new Pessoa();
		return null;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		 if(pessoa != null) {
	         pessoas = Banco.select();
	      } 
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}	
}
