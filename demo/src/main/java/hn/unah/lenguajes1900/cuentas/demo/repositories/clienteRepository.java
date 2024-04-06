package hn.unah.lenguajes1900.cuentas.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.cuentas.demo.entities.Cliente;

@Repository
public interface clienteRepository extends CrudRepository<Cliente, String> {

}
