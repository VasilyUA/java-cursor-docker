package com.example.demo;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class TestController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> healthyApi() {
        return ResponseEntity.ok("{\"statusSecurityApplicationApi\":\"ok\"}");
    }
}
