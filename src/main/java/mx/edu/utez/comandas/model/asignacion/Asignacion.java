package mx.edu.utez.comandas.model.asignacion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import mx.edu.utez.comandas.model.mesa.Mesa;
import mx.edu.utez.comandas.model.reservacion.Reservacion;
import mx.edu.utez.comandas.model.usuario.Usuario;

@Entity
@Table(name = "asignaciones")

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Asignacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignacion")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoOrigen tipoOrigen;

    @Column(nullable = false)
    private int numComensales;

    @Column(nullable = false)
    private LocalDateTime horaInicio;

    private LocalDateTime horaFin; //null mientras la mesa sigue ocupada

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoAsignacion estado;

    //Relaciones
    @ManyToOne
    @JoinColumn(name = "id_mesa", nullable = false)
    private Mesa mesa;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    //Puede ser null si la asignacion fue al momento (sin reservacion)
    @ManyToOne
    @JoinColumn(name = "id_reservacion")
    private Reservacion reservacion;

}
