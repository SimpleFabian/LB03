package com.webshop.elastic.resource;

import com.webshop.elastic.model.Artikel;
import com.webshop.elastic.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/webshop/artikel")
public class SearchResource {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/name/{text}")
    public List<Artikel> searchName(@PathVariable final String text) {
        return usersRepository.findByName(text);
    }

    @GetMapping(value = "/all")
    public List<Artikel> searchAll() {
        List<Artikel> usersList = new ArrayList<>();
        Iterable<Artikel> userses = usersRepository.findAll();
        userses.forEach(usersList::add);
        return usersList;
    }


}
