package mx.edu.utez.comandas.model.reservacion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import mx.edu.utez.comandas.model.mesa.Mesa;
import mx.edu.utez.comandas.model.usuario.Usuario;

@Entity
@Table(name = "reservaciones")

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Reservacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservacion")
    private Long id;

    @Column(length = 100, nullable = false)
    private String nombreContacto;

    @Column(length = 20, nullable = false)
    private String telefonoContacto;

    @Column(nullable = false)
    private LocalDateTime fechaHoraInicio;

    @Column(nullable = false)
    private int numComensales;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoReservacion estado;

    //Relaciones: muchas reservaciones de una mesa, registradas por un usuario (mesero)
    @ManyToOne
    @JoinColumn(name = "id_mesa", nullable = false)
    private Mesa mesa;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

}
