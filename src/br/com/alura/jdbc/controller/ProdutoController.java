package br.com.alura.jdbc.controller;

import java.util.List;
import java.sql.Connection;

import br.com.alura.jdbc.modelo.Produto;
import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;

public class ProdutoController {

	private ProdutoDAO produtoDAO;

	public ProdutoController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.produtoDAO = new ProdutoDAO(connection);
	}

	public void deletar(Integer id) {
		System.out.println("Deletando produto");
	}

	public void salvar(Produto produto) {
		System.out.println("Salvando produto");
	}

	public List<Produto> listar()
	{
		return this.produtoDAO.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		System.out.println("Alterando produto");
	}
}
