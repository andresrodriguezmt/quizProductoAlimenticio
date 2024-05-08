package andres.ejercicio.quiz.repositorio;

import andres.ejercicio.quiz.entidades.ProductoAlimenticio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProductoAlimenticio extends JpaRepository<ProductoAlimenticio, Integer> {
}
