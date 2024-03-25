package com.apitestepublicaoaws.com.apitestepublicaoaws.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
//@RequestMapping("/teste")

public class TesteController {

//    @GetMapping("/")
//    public String index() {
//        return "index"; // Retorna o nome do arquivo HTML
//    }

    @GetMapping("/")
    public ResponseEntity<String> retornaMensagem() throws IOException {
        Resource resource = new ClassPathResource("static/index.html");
        String htmlContent = new String(Files.readAllBytes(Paths.get(resource.getURI())));
        return ResponseEntity.ok().contentType(MediaType.TEXT_HTML).body(htmlContent);
    }
    @GetMapping("/teste")
    public String teste(){
        return  "API - Publicada com sucesso na AWS.";
    }

}
