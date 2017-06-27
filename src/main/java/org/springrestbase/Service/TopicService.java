package org.springrestbase.Service;

import org.springframework.stereotype.Service;
import org.springrestbase.Entity.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Valerio on 26/06/2017.
 * tipicamente in Spring un service è un singleton che mette a disposizione dei metodi/servizi ad un controller
 */

@Service
public class TopicService {

    List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(1,"APIconf","Turin 15/06/2017"),
            new Topic(2,"NetConference","Milan 23/07/2017"),
            new Topic(3,"RaveParty","Secret place")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(Integer id){
        return topics.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Integer id, Topic topic) {
        for(int i = 0; i<topics.size();i++){
            Topic t = topics.get(i);
            if (t.getId()==id){
                topics.set(i, topic);
                return;
            }
        }
    }
}
