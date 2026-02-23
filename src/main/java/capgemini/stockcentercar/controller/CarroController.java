package capgemini.stockcentercar.controller;

import capgemini.stockcentercar.dto.CarroFormDTO;
import capgemini.stockcentercar.model.Carro;
import capgemini.stockcentercar.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService service;

    @PostMapping()
    public Carro create(@RequestBody CarroFormDTO dto) {

        return service.create(dto);
    }

    @GetMapping()
    public List<Carro> read() {

        return service.read();
    }

    @GetMapping("/buscar/{id}")
    public Optional<Carro> buscar(@PathVariable Long id) {
        //System.out.println(id);
        return service.buscar(id);
    }

    @PutMapping()
    public String update() {

        return service.update();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        //System.out.println(id);

         service.delete(id);
    }
}
