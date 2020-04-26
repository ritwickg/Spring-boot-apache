package org.courseapi.controller;

import org.courseapi.topic.Topic;
import org.courseapi.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    private TopicService _topicService;

    @GetMapping("/all")
    public List<Topic> getAllTopics() {
        return this._topicService.getAllTopics();
    }

    @PostMapping("/add")
    public void addTopic(@RequestBody Topic topic) {
        this._topicService.addTopic(topic);
    }

    @PostMapping("/update")
    public void updateTopic(@RequestBody Topic topic) {
        this._topicService.updateTopic(topic);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTopicById(@PathVariable String id) {
        this._topicService.deleteTopicById(id);
    }
}
