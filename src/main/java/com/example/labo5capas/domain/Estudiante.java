package com.example.labo5capas.domain;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(schema = "public", name = "estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(generator = "estudiante_c_usuario_seq", strategy = GenerationType.AUTO)
    @Column(name = "c_usuario")
    public Integer codigoEstudiante;

    @Column(name = "nombre")
    @Size(message = "El nombre no debe tener mas de 50 caracteres", max=50)
    @NotEmpty(message = "Este campo no puede estar vacio")
    public String Nombre;

    @Column(name = "apellido")
    @Size(message = "El apellido no debe tener mas de 50 caracteres", max=50)
    @NotEmpty(message = "Este campo no puede estar vacio")
    public String Apellido;

    @Column(name = "carne")
    @Size(message = "El campo Carne debe tener 10 caracteres", max=10)
    @NotNull(message = "El campo no pede estar vacio")
    public String Carne;

    @Column(name = "carrera")
    @Size(message = "El nombre de la carrera no debe tener mas de 100 caracteres", max=100)
    @NotEmpty(message = "Este campo no puede estar vacio")
    public String Carrera;

    public Estudiante() {
    }

    public Integer getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(Integer codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCarne() {
        return Carne;
    }

    public void setCarne(String carne) {
        Carne = carne;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }
}
