package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by jantonio on 28/08/2020.
 */
@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World!");

        return "Hi Folks!!";
    }
}
