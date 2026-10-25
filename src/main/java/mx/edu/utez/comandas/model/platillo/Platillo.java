package mx.edu.utez.comandas.model.platillo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import mx.edu.utez.comandas.model.categoria.Categoria;

@Entity
@Table(name = "platillos")

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Platillo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_platillo")
    private Long id;

    @Column(length = 100, nullable = false)
    private String nombre;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal precio;

    @Column(nullable = false)
    private boolean disponible; //false = agotado

    //Relacion: muchos platillos pertenecen a una categoria
    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

}
