package com.company.MonthAndMath.models;

import java.util.Objects;

public class MonthConverter {
    private int monthNumber;

    public MonthConverter() {
    }

    public MonthConverter(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonthConverter that = (MonthConverter) o;
        return monthNumber == that.monthNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(monthNumber);
    }

    @Override
    public String toString() {
        return "MonthConverter{" +
                "monthNumber=" + monthNumber +
                '}';
    }
}
