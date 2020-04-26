package org.courseapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topicList = new ArrayList<>();
        // topicRepository.findAll().forEach(topicList::add);
        topicRepository.findAll().forEach(x -> topicList.add(x));
        return topicList;
    }

    public Topic getTopicById(String id) {
        return this.topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        this.topicRepository.save(topic);
    }

    public  void updateTopic(Topic topic) {
        this.topicRepository.save(topic);
    }

    public void deleteTopicById(String id) {
        this.topicRepository.deleteById(id);
    }

}
