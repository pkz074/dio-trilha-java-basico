package main.java.com.me.demo.repository;

import com.me.demo.entity.Prato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PratoRepository extends JpaRepository<Prato, Long> {
}
