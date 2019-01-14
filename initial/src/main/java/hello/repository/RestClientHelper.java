package hello.repository;/*package com.webshop.elastic.repository;

import java.net.UnknownHostException;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestClientHelper {
	
	private RestClient restClient;
	
	@Bean
	RestClient initRestClient() throws UnknownHostException {
		if (restClient == null) {
			restClient = RestClient.builder(
					new HttpHost ("localhost", 9200, "http"))
					.build();
		}
		return restClient;
	}

	@Bean
	ArtikelRepository artikelRepository() { return new ArtikelRepository();}
	
	@Bean
	RestHighLevelClient initRestHighLevelClient(){
		return new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200, "http")));
	}
}
*/