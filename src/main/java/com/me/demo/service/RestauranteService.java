package main.java.com.me.demo.service;

import com.me.demo.entity.Restaurante;
import com.me.demo.repository.RestauranteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteService {
    private final RestauranteRepository restauranteRepository;

    public RestauranteService(RestauranteRepository restauranteRepository) {
        this.restauranteRepository = restauranteRepository;
    }

    public List<Restaurante> getAllRestaurantes() {
        return restauranteRepository.findAll();
    }

    public Restaurante saveRestaurante(Restaurante restaurante) {
        return restauranteRepository.save(restaurante);
    }
}
