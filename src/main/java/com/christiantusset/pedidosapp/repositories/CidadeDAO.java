package com.christiantusset.pedidosapp.repositories;


import com.christiantusset.pedidosapp.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeDAO extends JpaRepository<Cidade, Integer> {


}
