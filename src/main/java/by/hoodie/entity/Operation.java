package by.hoodie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Operation {

    private double Num1;
    private double Num2;
    private String operation;
    private double result;

}
