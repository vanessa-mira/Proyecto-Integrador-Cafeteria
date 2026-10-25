package mx.edu.utez.comandas.repository.platillo;

import mx.edu.utez.comandas.model.platillo.Platillo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatilloRepository extends JpaRepository<Platillo, Long> {
}
