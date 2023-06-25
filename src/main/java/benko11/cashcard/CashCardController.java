package benko11.cashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashcard")
public class CashCardController {
    @GetMapping("/{id}")
    public ResponseEntity<CashCard> findById(@PathVariable Long id) throws Error {
        if (id < 1) {
            return ResponseEntity.notFound().build();
        }

        var cashCard = new CashCard(id, 123.0);
        return ResponseEntity.ok(cashCard);
    }
}
