package mx.edu.utez.comandas.repository.mesa;

import mx.edu.utez.comandas.model.mesa.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Long> {
}
