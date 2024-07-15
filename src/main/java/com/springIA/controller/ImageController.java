package com.springIA.controller;

import org.springframework.ai.image.Image;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@RequestMapping("/images")
public class ImageController {

    private final Image image;

    public ImageController(Image image) {
        this.imageClient = imageClient;
    }

    @GetMapping
    public String getUrlImage(@RequestParam("text") String text) {
        this.imageClient.call(new ImagePrompt(text).getResult().getOutput().geturl());
    }
}*/
