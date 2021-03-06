package com.kodilla.hibernate2.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "TASKS_FINANCIALS2")
public class TaskFinancialDetails2 {
    private int id;
    private BigDecimal price;
    private boolean paid;

    public TaskFinancialDetails2() {
    }

    public TaskFinancialDetails2(BigDecimal price, boolean paid) {
        this.price = price;
        this.paid = paid;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "PAID")
    public boolean isPaid() {
        return paid;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "TaskFinancialDetails2{" +
                "id=" + id +
                ", price=" + price +
                ", paid=" + paid +
                '}';
    }
}
