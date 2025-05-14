package br.com.fiap.winery;

import java.math.BigDecimal;

public class Vinho {
    private int id;
    private String name;
    private BigDecimal price;
    private String typeGrape;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTypeGrape() {
        return typeGrape;
    }

    public void setTypeGrape(String typeGrape) {
        this.typeGrape = typeGrape;
    }
}
