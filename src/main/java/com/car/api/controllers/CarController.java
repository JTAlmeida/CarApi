package com.car.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.car.api.dto.CarDTO;

@RestController
@RequestMapping("/api/car")
public class CarController {

    @PostMapping
    public void create(@RequestBody CarDTO req) {
        String text = "O carro é " + req.modelo() + "- " + req.anoModelo() + ", fabricado por " + req.fabricante()
                + " e custa R$" + req.valor();

        System.out.println(text);
    }
}
