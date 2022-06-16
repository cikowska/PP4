package pl.kcikowska.productcatalog;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductDataTest {
    @Test
    void itAssignsImageUrlProperly() {
        ProductData productData = new ProductData();
        assertEquals(null, productData.getImageUrl());
        String imgUrl = "https://example.com/image.jpg";
        productData.assignImage(imgUrl);
        assertEquals(imgUrl, productData.getImageUrl());
    }

    @Test
    void itChangesPriceProperly() {
        ProductData productData = new ProductData();
        assertEquals(null, productData.getPrice());
        BigDecimal price = new BigDecimal(123.45);
        productData.changePrice(price);
        assertEquals(price, productData.getPrice());
    }
}