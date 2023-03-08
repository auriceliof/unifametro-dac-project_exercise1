package bd;

import java.util.ArrayList;
import java.util.List;

import entidade.Pessoa;

public class Banco {

	private static List<Pessoa> banco = new ArrayList<Pessoa>();
	
	public static void salvar (Pessoa p) {
		banco.add(p);
	}
	
	public static List<Pessoa> select(){
		return banco;
	}
}
