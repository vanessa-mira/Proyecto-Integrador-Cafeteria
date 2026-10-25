package mx.edu.utez.comandas.repository.rol;

import mx.edu.utez.comandas.model.rol.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
}
