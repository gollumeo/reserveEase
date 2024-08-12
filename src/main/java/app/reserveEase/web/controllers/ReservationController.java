package app.reserveEase.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    @GetMapping("/")
    public Object getReservations() {
        return new HashMap<Integer, String>() {{
            put(1, "Reservation 5");
        }};
    }
}
