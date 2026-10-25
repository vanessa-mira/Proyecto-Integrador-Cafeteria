package mx.edu.utez.comandas.model.ticket;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import mx.edu.utez.comandas.model.asignacion.Asignacion;

@Entity
@Table(name = "tickets")

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket")
    private Long id;

    @Column(nullable = false)
    private LocalDateTime fechaHora;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal total;

    @Enumerated(EnumType.STRING)
    private FormaPago formaPago;

    //Relacion uno a uno: un ticket por asignacion terminada
    @OneToOne
    @JoinColumn(name = "id_asignacion", nullable = false, unique = true)
    private Asignacion asignacion;

}
