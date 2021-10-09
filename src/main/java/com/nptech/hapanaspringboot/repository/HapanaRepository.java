package com.nptech.hapanaspringboot.repository;

import com.nptech.hapanaspringboot.model.Hapana;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HapanaRepository extends MongoRepository<Hapana, String> {
    List<Hapana>  findByTitleName (String titleName);
}
