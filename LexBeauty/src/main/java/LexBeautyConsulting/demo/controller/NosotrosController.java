/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LexBeautyConsulting.demo.controller;

/**
 *
 * @author alexa
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NosotrosController {

    @GetMapping("/nosotros")
    public String nosotros() {
        return "nosotros/nosotros"; // Vista ubicada en templates/nosotros/nosotros.html
    }
}

