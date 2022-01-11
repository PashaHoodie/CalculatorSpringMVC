package by.hoodie.service;


import by.hoodie.entity.Operation;
import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public String getOperation(Operation operation) {
        return operation.getOperation();
    }

    public double getResult(Operation operation) {
        switch (operation.getOperation()) {
            case "sum":
                return operation.getNum1() + operation.getNum2();

            case "subtraction":
                return operation.getNum1() - operation.getNum2();

            case "multiplication":
                return operation.getNum1() * operation.getNum2();

            case "division":
                return operation.getNum1() / operation.getNum2();
        } return 1;
    }
}
