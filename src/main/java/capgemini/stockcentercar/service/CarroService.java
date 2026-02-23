package capgemini.stockcentercar.service;

import capgemini.stockcentercar.dto.CarroFormDTO;
import capgemini.stockcentercar.model.Carro;
import capgemini.stockcentercar.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository repository;

    public Carro create(CarroFormDTO dto) {
        //System.out.println("Cheguei na camada de service e estou devolvendo o dto");

        Carro entidade = new Carro();

        entidade.setNome(dto.getNome());
        entidade.setCor(dto.getCor());
        return repository.save(entidade);
    }


    public List<Carro> read() {

        return repository.findAll();
    }


    public Optional<Carro> buscar(Long id) {

        return repository.findById(id);
    }


    public String update() {

        return "Este metodo vai editar um registro";
    }


    public void delete(Long id) {

         repository.deleteById(id);
    }
}
