package com.christiantusset.pedidosapp.repositories;


import com.christiantusset.pedidosapp.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoDAO extends JpaRepository<Endereco, Integer> {


}
