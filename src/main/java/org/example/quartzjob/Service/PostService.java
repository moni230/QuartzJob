package org.example.quartzjob.Service;

import org.example.quartzjob.Entity.PostData;
import org.example.quartzjob.Repository.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class PostService {

    private RestTemplate restTemplate;
    private PostRepository repo;

    private PostData[] fetchedPosts;
    private int nextIndex = 0;

    public PostService(RestTemplate restTemplate, PostRepository repo) {
        this.restTemplate = restTemplate;
        this.repo = repo;

    }

    public PostData[] fetchPost() {

        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts", PostData[].class);
    }

    public void saveNextBatch() {


   }
}