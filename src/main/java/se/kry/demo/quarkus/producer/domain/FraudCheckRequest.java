package se.kry.demo.quarkus.producer.domain;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;

public record FraudCheckRequest(@Valid Client client, @Positive int loanAmount) {
}
