package com.christiantusset.pedidosapp.repositories;


import com.christiantusset.pedidosapp.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoDAO extends JpaRepository<Produto, Integer> {


}
