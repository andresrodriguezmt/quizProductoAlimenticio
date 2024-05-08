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
    public ProductoAlimenticio modificar(ProductoAlimenticio productoAlimenticio) {

        if(this.buscarPorPk(productoAlimenticio.getCodigo()) != null ){
            return repositorioProductoAlimenticio.save(productoAlimenticio);
        }else {
            return null;
        }

    }

    @Override
    public void eliminar(ProductoAlimenticio productoAlimenticio) {
        repositorioProductoAlimenticio.delete(productoAlimenticio);
    }

    @Override
    public void eliminar(int serial) {
        repositorioProductoAlimenticio.deleteById(serial);
    }

    @Override
    public List<ProductoAlimenticio> buscarTodos() {
        return repositorioProductoAlimenticio.findAll();
    }

    @Override
    public ProductoAlimenticio buscarPorPk(int pkEntidad) {
        return repositorioProductoAlimenticio.findById(pkEntidad).orElse(null);
    }
}
