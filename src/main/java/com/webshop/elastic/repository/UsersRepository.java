package com.webshop.elastic.repository;

import com.webshop.elastic.model.Artikel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface UsersRepository extends ElasticsearchRepository<Artikel, Long> {
    List<Artikel> findByName(String text);
}
