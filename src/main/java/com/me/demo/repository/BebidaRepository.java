package main.java.com.me.demo.repository;

import com.me.demo.entity.Bebida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BebidaRepository extends JpaRepository<Bebida, Long> {
}
