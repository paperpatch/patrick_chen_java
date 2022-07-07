package com.company.MonthAndMath.models;

import java.util.Objects;

public class RandomMonth {
    private int id;
    private String month;

    public RandomMonth(String month, int id) {
        this.id = id;
        this.month = month;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        RandomMonth that = (RandomMonth) o;
        return id == that.id && Objects.equals(month, that.month);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, month);
    }

    @Override
    public String toString() {
        return "RandomMonth{" +
                "id=" + id +
                ", month='" + month + '\'' +
                '}';
    }
}
