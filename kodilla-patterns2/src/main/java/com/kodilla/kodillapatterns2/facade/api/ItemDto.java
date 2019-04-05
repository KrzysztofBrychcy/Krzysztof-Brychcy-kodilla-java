package com.kodilla.kodillapatterns2.facade.api;

public class ItemDto {
    private final Long productId;
    private final double qunatity;

    public ItemDto(final Long productId, final double qunatity) {
        this.productId = productId;
        this.qunatity = qunatity;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQunatity() {
        return qunatity;
    }
}
