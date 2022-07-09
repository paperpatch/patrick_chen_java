package com.company.MonthAndMath.models;

import java.util.Objects;

public class Month {
    private int number;
    private String month;

    public Month() {
    }
    public Month(String month, int number) {
        this.number = number;
        this.month = month;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month1 = (Month) o;
        return number == month1.number && Objects.equals(month, month1.month);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, month);
    }

    @Override
    public String toString() {
        return "Month{" +
                "number=" + number +
                ", month='" + month + '\'' +
                '}';
    }
}
