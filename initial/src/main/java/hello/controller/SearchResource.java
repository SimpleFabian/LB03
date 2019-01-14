/*
package hello.controller;

import hello.model.Artikel;
import hello.model.ElasticSearchEntity;
import hello.repository.ArtikelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/webshop")
public class SearchResource {

    @Autowired
    ArtikelRepository artikelRepository;

    @RequestMapping(value = "/home", params = {"type=object"})
    public List<ElasticSearchEntity<Artikel>> artikelsObject(@RequestParam("type") String type) throws IOException {
    	List<ElasticSearchEntity<Artikel>> artikelList = artikelRepository.getArtikels();
    	return artikelList;
    }
*/
/*    @GetMapping(value = "/name/{text}")
    public List<Artikel> searchName(@PathVariable final String text) {
        //return artikelRepository.findByName(text);
    }*//*

  

*/
/*    @GetMapping(value = "/all")
    public List<Artikel> searchAll() {
        List<Artikel> artikelsList = new ArrayList<>();
        Iterable<Artikel> artikels = artikelRepository.findAll();
        artikels.forEach(artikelsList::add);
        return artikelsList;
    }*//*



}
*/
