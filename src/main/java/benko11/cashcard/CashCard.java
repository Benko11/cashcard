package benko11.cashcard;

import org.springframework.data.annotation.Id;

public record CashCard(@Id Long id, Double amount) {}