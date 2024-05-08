package andres.ejercicio.quiz.controladores;

import andres.ejercicio.quiz.entidades.ProductoAlimenticio;
import andres.ejercicio.quiz.servicios.ServicioProductoAlimenticio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorProductoAlimenticio {

    @Autowired
    ServicioProductoAlimenticio servicioProductoAlimenticio;

    @GetMapping({"/principal"})
    public String buscarTodas(Model model){
        model.addAttribute("listaProductosAlim", servicioProductoAlimenticio.buscarTodos());
        return "lista_productos";
    }

    @GetMapping({"/crear/producto"})
    public String formularioCrear(Model model){
        ProductoAlimenticio productoAlimenticio = new ProductoAlimenticio();
        model.addAttribute("productoAlimenticio", productoAlimenticio);
        return "crear_producto";
    }

    @PostMapping({"/producto"})
    public String crearProd(@ModelAttribute("productoAlimenticio") ProductoAlimenticio productoAlimenticio){


        if(productoAlimenticio != null){
            servicioProductoAlimenticio.crear(productoAlimenticio);
            return "redirect:/principal";
        }else{
            return "redirect:/crear/producto";
        }
    }

}
