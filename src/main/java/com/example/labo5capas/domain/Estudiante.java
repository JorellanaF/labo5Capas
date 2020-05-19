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

    @Size(message = "El nombre no debe tener mas de 15 caracteres", max=15)
    @NotEmpty(message = "Este campo no puede estar vacio")
    @Column(name = "nombre")
    public String Nombre;

    @Size(message = "El apellido no debe tener mas de 15 caracteres", max=15)
    @NotEmpty(message = "Este campo no puede estar vacio")
    @Column(name = "apellido")
    public String Apellido;

    @Size(min=1, max=12, message = "El campo Carne debe tener 9 caracteres")
    @NotNull(message = "El campo no pede estar vacio")
    @Column(name = "carne")
    public Integer Carne;

    @Size(message = "El nombre de Carrera no debe tener mas de 30 caracteres", max=30)
    @NotEmpty(message = "Este campo no puede estar vacio")
    @Column(name = "carrera")
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

    public Integer getCarne() {
        return Carne;
    }

    public void setCarne(Integer carne) {
        Carne = carne;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }
}
