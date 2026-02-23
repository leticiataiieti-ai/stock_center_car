package capgemini.stockcentercar.repository;

import capgemini.stockcentercar.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
    Long id(Long id);
}
