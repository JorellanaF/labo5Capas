package com.example.labo5capas.dao;

import com.example.labo5capas.domain.Estudiante;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface EstudianteDAO {

    public List<Estudiante> findAll() throws DataAccessException;

    public void insert(Estudiante e) throws  DataAccessException;

}
