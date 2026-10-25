package mx.edu.utez.comandas.repository.detalle_orden;

import mx.edu.utez.comandas.model.detalle_orden.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleOrdenRepository extends JpaRepository<DetalleOrden, Long> {
}
