package es.santander.ascender.ejerc002.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Boligrafo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String color; // Color del boligrafo (puede ser un número o un String)
    private boolean escribe; // Si el boligrafo escribe o no
    private String nombre; // Nombre del boligrafo

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEscribe() {
        return escribe;
    }

    public void setEscribe(boolean escribe) {
        this.escribe = escribe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
