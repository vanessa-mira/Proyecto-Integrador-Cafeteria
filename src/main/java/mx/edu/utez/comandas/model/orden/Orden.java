package mx.edu.utez.comandas.model.orden;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import mx.edu.utez.comandas.model.asignacion.Asignacion;
import mx.edu.utez.comandas.model.usuario.Usuario;

@Entity
@Table(name = "ordenes")

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden")
    private Long id;

    @Column(nullable = false)
    private LocalDateTime fechaHora;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoPreparacion estadoPreparacion;

    //Relaciones: muchas ordenes por asignacion (mesa ocupada), tomadas por un usuario (mesero)
    @ManyToOne
    @JoinColumn(name = "id_asignacion", nullable = false)
    private Asignacion asignacion;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

}
