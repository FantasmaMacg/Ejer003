package es.santander.ascender.ejerc003.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.santander.ascender.ejerc003.model.Boligrafo;
import es.santander.ascender.ejerc003.repository.BoligrafoRepository;

@Service
public class BoligrafoService {

    @Autowired
    private BoligrafoRepository repository;

    public Boligrafo create(Boligrafo boligrafo) {
        return repository.save(boligrafo);
    }

    public Boligrafo read(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Boligrafo> read() {
        return repository.findAll();
    }

    public Boligrafo update(Boligrafo boligrafo) {
        return repository.save(boligrafo);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
    
    public void deleteAll() {
        repository.deleteAll();
    }
}
