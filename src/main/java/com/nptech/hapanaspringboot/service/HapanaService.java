package com.nptech.hapanaspringboot.service;

import com.nptech.hapanaspringboot.model.Hapana;
import com.nptech.hapanaspringboot.repository.HapanaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HapanaService {
    private HapanaRepository hapanaRepository;

    @Autowired
    public HapanaService(HapanaRepository hapanaRepository) {
        this.hapanaRepository = hapanaRepository;
    }

    public Hapana createChat(Hapana hapana) {
        return hapanaRepository.save(hapana);
    }

    public List<Hapana> getAllChat() {
        return hapanaRepository.findAll();
    }
}
