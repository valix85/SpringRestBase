package org.springrestbase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    //@Autowired
    //private TopicService topicservice;


    @RequestMapping("/hello")
    public String hello(){
        return "Hello from topic controller";
    }

    @RequestMapping("/topics")
    public List<Topic> all(){
        return Arrays.asList(
                new Topic(1,"APIconf","Turin 15/06/2017"),
                new Topic(2,"NetConference","Milan 23/07/2017"),
                new Topic(3,"RaveParty","Secret place")
        );
    }

}
