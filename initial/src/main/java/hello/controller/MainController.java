package hello.controller;

import java.util.ArrayList;
import java.util.List;

import hello.model.Artikel;
import hello.model.ElasticSearchEntity;
import hello.model.Person;
import hello.repository.ArtikelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    private static List<Person> persons = new ArrayList<Person>();

    @Autowired
    ArtikelRepository artikelRepository;

    static {
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
    }

    // Inject via application.properties
    @Value("${welcome.message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("message", message);

        return "index.html";
    }

    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String personList(Model model) {

      /*  List<ElasticSearchEntity<Artikel>> artikelList = artikelRepository.getArtikels();

        model.addAttribute("articles", artikelList);*/

        model.addAttribute("persons", persons);
        return "personList.html";
    }

}