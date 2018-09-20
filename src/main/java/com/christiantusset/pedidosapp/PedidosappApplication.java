package com.christiantusset.pedidosapp;

import com.christiantusset.pedidosapp.domain.Categoria;
import com.christiantusset.pedidosapp.domain.Cidade;
import com.christiantusset.pedidosapp.domain.Estado;
import com.christiantusset.pedidosapp.domain.Produto;
import com.christiantusset.pedidosapp.repositories.CategoriaDAO;
import com.christiantusset.pedidosapp.repositories.CidadeDAO;
import com.christiantusset.pedidosapp.repositories.EstadoDAO;
import com.christiantusset.pedidosapp.repositories.ProdutoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class PedidosappApplication implements CommandLineRunner {

	@Autowired
	private CategoriaDAO repoCategoria;

	@Autowired
	private ProdutoDAO repoProduto;

	@Autowired
	private CidadeDAO repoCidade;

	@Autowired
	private EstadoDAO repoEstado;

	public static void main(String[] args) {
		SpringApplication.run(PedidosappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Escritório");

		Produto p1 = new Produto(null,"Computador", 2000.00);
		Produto p2 = new Produto(null,"Impressora",800.00);
		Produto p3 = new Produto(null,"Mouse",80.00);

		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		repoCategoria.saveAll(Arrays.asList(cat1,cat2));
		repoProduto.saveAll(Arrays.asList(p1,p2,p3));

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null,"São Paulo");

		Cidade c1 = new Cidade(null,"Uberlândia",est1);
		Cidade c2 = new Cidade(null,"São Paulo",est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);

		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2,c3));

		repoEstado.saveAll(Arrays.asList(est1,est2));
		repoCidade.saveAll(Arrays.asList(c1,c2,c3));

	}
}
