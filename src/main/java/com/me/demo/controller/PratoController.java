package main.java.com.me.demo.controller;

import com.me.demo.entity.Prato;
import com.me.demo.service.PratoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pratos")
public class PratoController {
    private final PratoService pratoService;

    public PratoController(PratoService pratoService) {
        this.pratoService = pratoService;
    }

    @GetMapping
    public List<Prato> getAllPratos() {
        return pratoService.getAllPratos();
    }

    @PostMapping
    public Prato createPrato(@RequestBody Prato prato) {
        return pratoService.savePrato(prato);
    }
}
