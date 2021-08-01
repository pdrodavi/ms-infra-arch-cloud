package br.com.pedrodavi.hrworker.repository;

import br.com.pedrodavi.hrworker.model.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
