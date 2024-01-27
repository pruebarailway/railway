/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Railway.Controller;

import com.example.Railway.Models.Usuario;
import com.example.Railway.Service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author l
 */
@RestController
@RequestMapping(path="/apirest/")
@CrossOrigin("*")
public class UserController {
    
    @Autowired
    UserService serv;

    @GetMapping("/all")
    public List<Usuario> traertodo(){
        return serv.traerusu();
    }
      
}
