package mx.edu.utez.comandas.model.detalle_orden;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import mx.edu.utez.comandas.model.orden.Orden;
import mx.edu.utez.comandas.model.platillo.Platillo;

@Entity
@Table(name = "detalle_orden")

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DetalleOrden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Long id;

    @Column(nullable = false)
    private int cantidad;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal precioUnitario; //precio del platillo al momento de pedir

    private String notas; //por ejemplo "sin cebolla"

    //Relaciones - detalle_orden guarda la orden y el platillo
    @ManyToOne
    @JoinColumn(name = "id_orden", nullable = false)
    private Orden orden;

    @ManyToOne
    @JoinColumn(name = "id_platillo", nullable = false)
    private Platillo platillo;

}
