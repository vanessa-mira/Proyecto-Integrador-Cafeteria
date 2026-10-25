package mx.edu.utez.comandas.repository.reservacion;

import mx.edu.utez.comandas.model.reservacion.Reservacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservacionRepository extends JpaRepository<Reservacion, Long> {
}
