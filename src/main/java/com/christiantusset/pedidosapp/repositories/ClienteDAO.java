package com.christiantusset.pedidosapp.repositories;


import com.christiantusset.pedidosapp.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Integer> {


}
