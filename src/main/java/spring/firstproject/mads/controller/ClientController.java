package spring.firstproject.mads.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import spring.firstproject.mads.domain.Client;
import spring.firstproject.mads.repos.ClientRepo;

@RestController
@RequestMapping("clients")
public class ClientController {
    @Autowired
    private ClientRepo clientRepo;
    @PostMapping("/add")
    public @ResponseBody String postClient(@RequestParam String fname,@RequestParam String lname, @RequestParam String email){
        Client client=new Client(fname,lname,email);

        clientRepo.save(client);
        return "Saved";
    }

    @GetMapping(path="/{id}")
    public @ResponseBody String getAllUsers(@PathVariable long id) {

        return  clientRepo.findById(id).get().getEmail();
    }

}
