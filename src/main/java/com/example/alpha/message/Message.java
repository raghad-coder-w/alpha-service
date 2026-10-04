package com.example.alpha.message;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("messages")
public record Message(
        @Id
        Integer id,
        String content
) {}
