package local.dgnex.hyperionstarsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PublicController {

    @GetMapping({"/"})
    public ModelAndView getHome() {
        System.out.println("getHome()");
        return new ModelAndView("/home");
    }
}
