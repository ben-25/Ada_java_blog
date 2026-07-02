package fr.ada.java_blog.controller;

import fr.ada.java_blog.model.Auteur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AuteurController {

    private List<Auteur> auteurs = List.of(
        new Auteur("Jean", "Jean@exemple.com"),
        new Auteur("Michelle", "Michelle@exemple.com"),
        new Auteur("Marie", "Marie@exemple.com")
    );

    @GetMapping("/auteur")
    public List<Auteur> lister() {
        return auteurs;
    }

    @GetMapping("/auteur/{numero}")
    public Auteur getArticle(@PathVariable int numero) {
        return auteurs.get(numero);
    }
    
}
