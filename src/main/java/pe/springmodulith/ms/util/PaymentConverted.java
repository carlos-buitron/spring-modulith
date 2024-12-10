package pe.springmodulith.ms.util;

import jakarta.persistence.AttributeConverter;

import pe.springmodulith.ms.enums.PaymentStatus;

import java.util.Arrays;

public class PaymentConverted implements AttributeConverter<PaymentStatus, String> {

    @Override
    public String convertToDatabaseColumn(PaymentStatus paymentStatus) {
        if(paymentStatus == null) throw new IllegalArgumentException("paymentStatus can not be null");
        return paymentStatus.getCode();
    }

    @Override
    public PaymentStatus convertToEntityAttribute(String code) {
        if(code == null) throw new IllegalArgumentException("code can not be null");
        return Arrays.stream(PaymentStatus.values())
                .filter(p -> p.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
