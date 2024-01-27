/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Railway.Service;

import com.example.Railway.Models.Usuario;
import com.example.Railway.Repository.RepoUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author l
 */
@Service
public class UserService {
    
    @Autowired 
    RepoUser rep;
    
    public List<Usuario> traerusu(){
        return rep.findAll();
    }
    
}
