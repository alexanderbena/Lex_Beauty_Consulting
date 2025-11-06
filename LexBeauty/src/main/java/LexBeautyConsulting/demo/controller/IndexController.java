package LexBeautyConsulting.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @GetMapping("/nosotros")
    public String nosotros() {
        return "nosotros/listado";
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto/listado";
    }
}
