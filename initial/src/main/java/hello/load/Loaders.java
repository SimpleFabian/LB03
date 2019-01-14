package hello.load;/*package com.webshop.elastic.load;

import com.webshop.elastic.model.Artikel;
import com.webshop.elastic.repository.ArtikelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loaders {

    @Autowired
    ElasticsearchOperations operations;

    @Autowired
    ArtikelRepository artikelRepository;

    @PostConstruct
    @Transactional
    public void loadAll(){

        operations.putMapping(Artikel.class);
        System.out.println("Loading Data");
        //artikelRepository.save(getData());
        System.out.printf("Loading Completed");

    }

    private List<Artikel> getData() {
        List<Artikel> userses = new ArrayList<>();
        userses.add(new Artikel("Cause I Know",123L, "Accounting", ""));
        userses.add(new Artikel("Jaga",1234L, "Finance", ""));
        userses.add(new Artikel("Thiru",1235L, "Accounting", ""));
        return userses;
    }
}*/
