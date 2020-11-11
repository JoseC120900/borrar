package pe.edu.upc.ezshipping.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.ezshipping.models.entities.TipoCliente;
import pe.edu.upc.ezshipping.models.repositories.TipoClienteRepository;
import pe.edu.upc.ezshipping.services.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private TipoClienteRepository tipoClienteRepository;

	@Transactional
	@Override
	public TipoCliente save(TipoCliente entity) throws Exception {
		return tipoClienteRepository.save(entity);
	}

	@Transactional
	@Override
	public TipoCliente update(TipoCliente entity) throws Exception {
		return tipoClienteRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		tipoClienteRepository.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<TipoCliente> findById(Integer id) throws Exception {
		return tipoClienteRepository.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<TipoCliente> findAll() throws Exception {
		return tipoClienteRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<TipoCliente> findByNombre(String nombre) throws Exception {
		return tipoClienteRepository.findByNombre(nombre);
	}

}
