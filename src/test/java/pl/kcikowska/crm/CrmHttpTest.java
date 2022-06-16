package pl.kcikowska.crm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CrmHttpTest {

    @LocalServerPort
    int port;

    @Autowired
    TestRestTemplate http;
    @Test
    void itReturns200() {
        String url = String.format(
                "http://localhost:%s/api/clients", port);
        ResponseEntity<Client[]> response = http.getForEntity(url, Client[].class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
