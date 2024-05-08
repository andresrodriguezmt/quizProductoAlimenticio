package andres.ejercicio.quiz.operaciones;

import andres.ejercicio.quiz.entidades.ProductoAlimenticio;

import java.util.List;

public interface OperacionesProductoAlimenticio {

    public ProductoAlimenticio crear(ProductoAlimenticio productoAlimenticio);



    public List<ProductoAlimenticio> buscarTodos();

}
