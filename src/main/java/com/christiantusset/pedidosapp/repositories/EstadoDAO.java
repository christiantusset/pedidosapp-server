package com.christiantusset.pedidosapp.repositories;


import com.christiantusset.pedidosapp.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoDAO extends JpaRepository<Estado, Integer> {


}
