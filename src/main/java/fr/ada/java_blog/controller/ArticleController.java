package fr.ada.java_blog.controller;

import fr.ada.java_blog.model.Article;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ArticleController {

    private List<Article> articles = List.of(
        new Article("Mon premier article", "Bonjour le blog !"),
        new Article("La machine de Turing", "Un texte sur le calcul."),
        new Article("Jolie titre", "Beau contenu")
    );

    @GetMapping("/articles")
    public List<Article> lister() {
        return articles;
    }

    @GetMapping("/articles/count")
    public int count(){
        return articles.size();
    }

    @GetMapping("/articles/{numero}")
    public Article getArticle(@PathVariable int numero) {
        return articles.get(numero);
    }
    
}
