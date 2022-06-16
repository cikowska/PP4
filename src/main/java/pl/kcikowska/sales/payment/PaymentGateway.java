package pl.kcikowska.sales.payment;

public interface PaymentGateway {
    RegisterPaymentResponse register(RegisterPaymentRequest registerPaymentRequest);
}
