package br.com.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
