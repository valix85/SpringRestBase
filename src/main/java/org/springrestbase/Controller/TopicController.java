package org.springrestbase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springrestbase.Entity.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springrestbase.Service.TopicService;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Valerio on 26/06/2017.
 */
@RestController
public class TopicController {

    //"inietto" il servizio che sarà usato dal controller per ottenere delle funzionaità
    //il fatto di annotarlo come Autowired fa si chè sia il framework ad offrirmi un'istanza utilizzabile quando serva ( https://www.tutorialspoint.com/spring/spring_autowired_annotation.htm )
    @Autowired
    private TopicService topicservice;

    //Mappa indirizzo su cui deve rispondere, se il metodo non è specificicato di default è GET
    @RequestMapping("/hello")
    public String hello(){
        return "Hello from topic controller";
    }

    @RequestMapping("/topics")
    public List<Topic> all(){
        return topicservice.getAllTopics();
    }

    //Tra le parentesi graffe specifico una variabile dall'URL path, richiamata poi
    //con l'annotazione @PathVariable("nomeDellaVariabile"), se è lo stesso
    //che si passa nel metodo si può omettere
    //Meglio ipotizzarer subito il tipo giusto cosicchè sia il framework a fare la
    //conversione e non io a garantirmi la correttezza del parametro.
    //N.B. URL Param in origine è sempre String, ma lascio a spring il compito di
    //effettuare la conversione corretta
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable  Integer id){
        return topicservice.getTopic(id);
    }

}
