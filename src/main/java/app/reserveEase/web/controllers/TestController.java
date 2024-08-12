package app.reserveEase.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/coucou")
    public Map<String, String> coucou() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "test");
        response.put("status", "dcftvgb");

        return response;
    }

}
