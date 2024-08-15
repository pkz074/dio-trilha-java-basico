package main.java.com.me.demo.service;

import com.me.demo.entity.Prato;
import com.me.demo.repository.PratoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PratoService {
    private final PratoRepository pratoRepository;

    public PratoService(PratoRepository pratoRepository) {
        this.pratoRepository = pratoRepository;
    }

    public List<Prato> getAllPratos() {
        return pratoRepository.findAll();
    }

    public Prato savePrato(Prato prato) {
        return pratoRepository.save(prato);
    }
}
