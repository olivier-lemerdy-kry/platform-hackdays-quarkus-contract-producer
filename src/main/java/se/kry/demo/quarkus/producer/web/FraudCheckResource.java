package se.kry.demo.quarkus.producer.web;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import se.kry.demo.quarkus.producer.domain.FraudCheckRequest;
import se.kry.demo.quarkus.producer.domain.FraudCheckResponse;
import se.kry.demo.quarkus.producer.domain.FraudCheckStatus;

@Path("/fraudcheck")
public class FraudCheckResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public FraudCheckResponse fraudCheck(FraudCheckRequest request) {
    if (request.loanAmount() > 10000) {
      return new FraudCheckResponse(FraudCheckStatus.FRAUD, "Amount too high");
    }
    return new FraudCheckResponse(FraudCheckStatus.OK, null);
  }
}
