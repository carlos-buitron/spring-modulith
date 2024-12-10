package pe.springmodulith.ms.util;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import pe.springmodulith.ms.enums.Status;

import java.util.Arrays;

@Converter(autoApply = true)
public class StatusConverted implements AttributeConverter<Status, String> {
    @Override
    public String convertToDatabaseColumn(Status status) {
        return Arrays.stream(status.values())
                .filter(s -> s == status)
                .map(Status::getCode)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Status not found"));
    }

    @Override
    public Status convertToEntityAttribute(String code) {
        return Arrays.stream(Status.values())
                .filter(s -> s.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Status not found"));
    }
}
