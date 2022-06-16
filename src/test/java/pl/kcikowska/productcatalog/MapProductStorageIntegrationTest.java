package pl.kcikowska.productcatalog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapProductStorageIntegrationTest {

    @Test
    void itStoresAndLoadsProduct() {
        ProductStorage mapProductStorage = new MapProductStorage();
        ProductData sampleProduct = thereIsSampleProductData();
        mapProductStorage.save(sampleProduct);
        ProductData loaded = mapProductStorage.loadById(sampleProduct.getId());
        assertEquals(sampleProduct.getName(), loaded.getName());
    }

    private ProductData thereIsSampleProductData() {
        return new ProductData("lego-1", "nice one");
    }
}
