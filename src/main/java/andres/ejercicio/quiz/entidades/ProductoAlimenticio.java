package andres.ejercicio.quiz.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRODUCTOALIMENTICIO")
@Entity
@Builder
public class ProductoAlimenticio {

    @Id
    @Column(name = "PRO_CODIGO", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRUDUCTOALIMENTICIO")
    @SequenceGenerator(name = "SEQ_PRUDUCTOALIMENTICIO", sequenceName = "SEQ_PRUDUCTOALIMENTICIO", allocationSize = 1)
    private int codigo;

    @Column(name = "PRO_EMPRESA", nullable = false)
    private String empresa;

    @Column(name = "PRO_CATEGORIA", nullable = false)
    private String categoria;

    @Column(name = "PRO_NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "PRO_PRECIO", nullable = false)
    private float precio;

    @Column(name = "PRO_pais", nullable = false)
    private String pais;

}
