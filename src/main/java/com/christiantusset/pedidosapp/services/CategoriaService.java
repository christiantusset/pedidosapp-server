package com.christiantusset.pedidosapp.services;

import com.christiantusset.pedidosapp.domain.Categoria;
import com.christiantusset.pedidosapp.repositories.CategoriaDAO;
import com.christiantusset.pedidosapp.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaDAO repository;

    public Categoria findById(Integer id) {

        Optional<Categoria> obj = repository.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException( "Objeto não encontrado! Id: " + id + ", Tipo: "
                + Categoria.class.getName()));
    }

}
