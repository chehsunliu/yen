package io.github.chehsunliu.yen.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/ui/v1/hello")
    public ResponseEntity<HelloResponse> hello() {
        return ResponseEntity.status(HttpStatus.OK).body(new HelloResponse("ok"));
    }

    public record HelloResponse(String status) {}
}
