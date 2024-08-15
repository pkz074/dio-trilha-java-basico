package com.me.demo.controller;

import com.me.demo.entity.Bebida;
import com.me.demo.service.BebidaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bebidas")
public class BebidaController {
    private final BebidaService bebidaService;

    public BebidaController(BebidaService bebidaService) {
        this.bebidaService = bebidaService;
    }

    @GetMapping
    public List<Bebida> getAllBebidas() {
        return bebidaService.getAllBebidas();
    }

    @PostMapping
    public Bebida createBebida(@RequestBody Bebida bebida) {
        return bebidaService.saveBebida(bebida);
    }
}
