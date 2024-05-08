package andres.ejercicio.quiz.servicios;

import andres.ejercicio.quiz.entidades.ProductoAlimenticio;
import andres.ejercicio.quiz.operaciones.OperacionesProductoAlimenticio;
import andres.ejercicio.quiz.repositorio.RepositorioProductoAlimenticio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioProductoAlimenticio implements OperacionesProductoAlimenticio {

    @Autowired
    RepositorioProductoAlimenticio repositorioProductoAlimenticio;

    @Override
    public ProductoAlimenticio crear(ProductoAlimenticio productoAlimenticio) {
        return repositorioProductoAlimenticio.save(productoAlimenticio);
    }

    @Override
    public List<ProductoAlimenticio> buscarTodos() {
        return repositorioProductoAlimenticio.findAll();
    }
}
