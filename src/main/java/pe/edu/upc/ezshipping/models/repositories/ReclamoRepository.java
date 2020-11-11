package pe.edu.upc.ezshipping.models.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.ezshipping.models.entities.Reclamo;

public interface ReclamoRepository extends JpaRepository<Reclamo, Integer> {
	Optional<Reclamo> findByDescripcion(String descripcion) throws Exception;
}
