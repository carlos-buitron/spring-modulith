package pe.springmodulith.ms.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentStatus {
    INCOMPLETE("I"), COMPLETE("C"), FAILED("F");
    private final String code;
}
