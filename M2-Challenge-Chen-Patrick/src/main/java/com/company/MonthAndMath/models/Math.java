package com.company.MonthAndMath.models;

import java.util.Objects;

public class Math {
    private int operand1;
    private int operand2;
    private int answer;

    public Math() {
    }

    public Math(int operand1, int operand2, int answer) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.answer = answer;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
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
        return operand1 == math.operand1 && operand2 == math.operand2 && answer == math.answer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2, answer);
    }

    @Override
    public String toString() {
        return "Math{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                ", answer=" + answer +
                '}';
    }
}
