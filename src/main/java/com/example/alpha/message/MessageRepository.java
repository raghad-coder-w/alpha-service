package com.example.alpha.message;

import org.springframework.data.repository.ListCrudRepository;

public interface MessageRepository extends ListCrudRepository<Message, Integer> {
}
