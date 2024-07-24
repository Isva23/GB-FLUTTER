package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.UsuarioModel;
import com.example.demo.models.UsuarioModelDTO;
import com.example.demo.services.UsuarioService;


@RestController
@RequestMapping("/api/v1")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public ArrayList<UsuarioModel> getAllUsers() {
        return usuarioService.getAllUsers();
    }

    @PostMapping("/usuarios")
    public UsuarioModel saveUser(@RequestBody UsuarioModel user){
        return this.usuarioService.saveUser(user);
    }

    @GetMapping(path = "usuarios/{id}")
    public Optional<UsuarioModel> getById(@PathVariable("id") Long id){
        return this.usuarioService.getById(id);
    }

    @DeleteMapping(path = "usuarios/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.deleteUser(id);
        if (ok) {
            return "Se elimino correctamente el usuario con id" + id;
        }else{
            return "No se pudo eliminar el usuario con id" + id;
        }
    }

    @PostMapping("/login")
    public ResponseEntity<UsuarioModelDTO> login (@RequestBody UsuarioModel user){
        UsuarioModelDTO loggedInUser = usuarioService.login(user.getEmail(),user.getPassword());
        if (loggedInUser != null) {
            return ResponseEntity.ok(loggedInUser);
        }
        else{
            return ResponseEntity.status(401).build();
        }
    }    
    

    
}
