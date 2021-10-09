package com.nptech.hapanaspringboot.controller;

import com.nptech.hapanaspringboot.model.Hapana;
import com.nptech.hapanaspringboot.service.HapanaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/hapana")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HapanaController {
    @Autowired
    private HapanaService hapanaService;

    @GetMapping()
    public ResponseEntity<?> getAllChat() {
        List<Hapana> hapana = hapanaService.getAllChat();
        System.out.println(hapana);
        return ResponseEntity.ok(hapana);
    }

    @PostMapping()
    public ResponseEntity<?> createChat(@RequestBody Hapana body) {
        Hapana hapana = hapanaService.createChat(body);
        return ResponseEntity.ok(hapana);
    }

}
