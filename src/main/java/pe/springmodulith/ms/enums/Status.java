package pe.springmodulith.ms.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum Status {
    OPEN("O"), COMPLETED("C");
    private final String code;
    //private String code;
    /*Status(String code) {
        this.code = code;
    }*/
}
