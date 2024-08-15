package com.me.demo.service;

import com.me.demo.entity.Bebida;
import com.me.demo.repository.BebidaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BebidaService {
    private final BebidaRepository bebidaRepository;

    public BebidaService(BebidaRepository bebidaRepository) {
        this.bebidaRepository = bebidaRepository;
    }

    public List<Bebida> getAllBebidas() {
        return bebidaRepository.findAll();
    }

    public Bebida saveBebida(Bebida bebida) {
        return bebidaRepository.save(bebida);
    }
}
