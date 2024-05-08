package andres.ejercicio.quiz.operaciones;

import andres.ejercicio.quiz.entidades.ProductoAlimenticio;

import java.util.List;

public interface OperacionesProductoAlimenticio {

    public ProductoAlimenticio crear(ProductoAlimenticio productoAlimenticio);

    public ProductoAlimenticio modificar(ProductoAlimenticio productoAlimenticio);

    public void eliminar(ProductoAlimenticio productoAlimenticio);

    public void eliminar(int serial);

    public List<ProductoAlimenticio> buscarTodos();

    public ProductoAlimenticio buscarPorPk(int pkEntidad);
}
