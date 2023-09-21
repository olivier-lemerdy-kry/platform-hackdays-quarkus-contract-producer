package se.kry.demo.quarkus.producer.domain;

public record FraudCheckResponse(FraudCheckStatus fraudCheckStatus, String rejection) {
}
