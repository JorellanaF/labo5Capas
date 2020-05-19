package com.example.labo5capas.dao;

import com.example.labo5capas.domain.Estudiante;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EstudianteDAOImpl implements EstudianteDAO{

    @PersistenceContext(unitName = "capas")
    private EntityManager entityManager;

    @Override
    public List<Estudiante> findAll() throws DataAccessException {
        StringBuffer sb = new StringBuffer();
        sb.append("SELECT * FROM public.estudiante");
        Query query = entityManager.createNativeQuery(sb.toString(), Estudiante.class);
        List<Estudiante> resultset = query.getResultList();

        return resultset;
    }

    @Override
    @Transactional
    public void insert(Estudiante e) throws DataAccessException {
        if(e.getCodigoEstudiante() == null){
            entityManager.persist(e);// Persist para insertar
        }else {
            entityManager.merge(e); // UPDATE
        }
    }
}
