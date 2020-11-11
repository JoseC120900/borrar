package pe.edu.upc.ezshipping.models.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.ezshipping.models.entities.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {
	Optional<TipoCliente> findByNombre(String nombre) throws Exception;
}
