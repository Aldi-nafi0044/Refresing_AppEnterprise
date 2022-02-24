/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.enterprise.refresing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nafi
 */
@Controller
public class embuhController {

    @RequestMapping(value = "/view")
    public String calculator(Model model) {
        int a = 3;
        int b = 4;
        model.addAttribute("angka1", a);
        model.addAttribute("angka2", b);

        return "index";
    }
}
