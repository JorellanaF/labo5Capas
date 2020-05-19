package com.example.labo5capas.controller;

import com.example.labo5capas.dao.EstudianteDAO;
import com.example.labo5capas.domain.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private EstudianteDAO estudianteDAO;

    @RequestMapping("/estudiante")
    public ModelAndView form(@Valid @ModelAttribute Estudiante estudiante, BindingResult result){
        ModelAndView mod = new ModelAndView();
        mod.addObject("estudiante", new Estudiante());
        mod.setViewName("index");

        return mod;
    }

    //Mostrar lista de Estudiante
    @RequestMapping("/listado")
    public ModelAndView initMain(){
        ModelAndView mav = new ModelAndView();
        List<Estudiante> estudiantes = null;
        try {
            estudiantes = estudianteDAO.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        mav.addObject("estudiantes", estudiantes);
        mav.setViewName("listado");

        return mav;
    }

    @RequestMapping("/procesado")
    public ModelAndView procesForm(@Valid @ModelAttribute Estudiante estudiante, BindingResult result){
        ModelAndView mav = new ModelAndView();
        if(result.hasErrors()){
            mav.setViewName("index");
        }else {
            estudianteDAO.insert(estudiante);
            mav.addObject("estudiante", new Estudiante());
            mav.setViewName("index");
        }
        return mav;
    }
}
