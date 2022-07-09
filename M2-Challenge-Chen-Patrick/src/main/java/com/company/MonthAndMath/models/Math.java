package com.company.MonthAndMath.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class Math {

    // Made operand1 and operand 2 to Strings in order to validate whether parameter is empty.
    @NotEmpty(message = "You must supply a value for operand1.")
    private String operand1;
    @NotEmpty(message = "You must supply a value for operand2.")
    private String operand2;
    private int answer;

    public Math() {
    }

    public String getOperand1() {
        return operand1;
    }

    public void setOperand1(String operand1) {
        this.operand1 = operand1;
    }

    public String getOperand2() {
        return operand2;
    }

    public void setOperand2(String operand2) {
        this.operand2 = operand2;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Math math = (Math) o;
        return answer == math.answer && Objects.equals(operand1, math.operand1) && Objects.equals(operand2, math.operand2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2, answer);
    }

    @Override
    public String toString() {
        return "Math{" +
                "operand1='" + operand1 + '\'' +
                ", operand2='" + operand2 + '\'' +
                ", answer=" + answer +
                '}';
    }
}
