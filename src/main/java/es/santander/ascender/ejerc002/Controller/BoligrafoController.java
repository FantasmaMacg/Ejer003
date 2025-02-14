package es.santander.ascender.ejerc002.Controller;
import es.santander.ascender.ejerc002.model.Boligrafo;
import es.santander.ascender.ejerc002.service.BoligrafoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boligrafo")
public class BoligrafoController {

    @Autowired
    private BoligrafoService boligrafoService;

    @PostMapping
    public Boligrafo create(@RequestBody Boligrafo boligrafo) {
        return boligrafoService.create(boligrafo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Boligrafo> read(@PathVariable Long id) {
        Boligrafo boligrafo = boligrafoService.read(id);
        if (boligrafo != null) {
            return new ResponseEntity<>(boligrafo, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<Boligrafo>> read() {
        List<Boligrafo> boligrafos = boligrafoService.read();
        return new ResponseEntity<>(boligrafos, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Boligrafo> update(@PathVariable Long id, @RequestBody Boligrafo boligrafo) {
        boligrafo.setId(id);
        Boligrafo updatedBoligrafo = boligrafoService.update(boligrafo);
        return new ResponseEntity<>(updatedBoligrafo, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        boligrafoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
