/*
package hello.controller;

import hello.model.Artikel;
import hello.model.ElasticSearchEntity;
import hello.repository.ArtikelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.List;

@Controller
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "home.html";
    }

    @Autowired
    ArtikelRepository artikelRepository;

    @RequestMapping(value = "/articels")
    public List<ElasticSearchEntity<Artikel>> artikelsObject() {
        List<ElasticSearchEntity<Artikel>> artikelList = artikelRepository.getArtikels();
        return artikelList;
    }

    @RequestMapping("/artikel")
    public String listContact(Model model) {

        List<ElasticSearchEntity<Artikel>> artikelList = artikelRepository.getArtikels();

        model.addAttribute("articles", artikelList);

        return "index.html";
    }
}
*/
