package com.christiantusset.pedidosapp;

import com.christiantusset.pedidosapp.domain.Categoria;
import com.christiantusset.pedidosapp.repositories.CategoriaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class PedidosappApplication implements CommandLineRunner {

	@Autowired
	private CategoriaDAO repoCategoria;

	public static void main(String[] args) {
		SpringApplication.run(PedidosappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Escritório");

		repoCategoria.saveAll(Arrays.asList(cat1,cat2));
	}
}
