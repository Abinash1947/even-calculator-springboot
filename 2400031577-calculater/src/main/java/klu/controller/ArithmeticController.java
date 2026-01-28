package klu.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ArithmeticController {

    // Addition
    @GetMapping("/add/{A}/{B}")
    public String add(@PathVariable("A") int a,
                      @PathVariable("B") int b) {
        return "Addition = " + (a + b);
    }

    // Subtraction
    @GetMapping("/sub/{A}/{B}")
    public String subtract(@PathVariable("A") int a,
                            @PathVariable("B") int b) {
        return "Subtraction = " + (a - b);
    }

    // Multiplication
    @GetMapping("/mul/{A}/{B}")
    public String multiply(@PathVariable("A") int a,
                            @PathVariable("B") int b) {
        return "Multiplication = " + (a * b);
    }

    // Division
    @GetMapping("/div/{A}/{B}")
    public String divide(@PathVariable("A") int a,
                          @PathVariable("B") int b) {
        if (b == 0) {
            return "Division by zero is not allowed";
        }
        return "Division = " + (a / b);
    }

    // Modulus
    @GetMapping("/mod/{A}/{B}")
    public String modulus(@PathVariable("A") int a,
                           @PathVariable("B") int b) {
        return "Modulus = " + (a % b);
    }
}
