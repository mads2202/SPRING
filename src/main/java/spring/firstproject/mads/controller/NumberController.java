package spring.firstproject.mads.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("numbers")
public class NumberController {
    @GetMapping
    public int randomNumber(){
        Random r=new Random();

        return r.nextInt() ;

    }
}
