package labs.mongodb.veiculos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import labs.mongodb.veiculos.model.Veiculos;
@Repository
public interface VeiculosRepository extends MongoRepository<Veiculos,Object> {
	Veiculos findByPlaca(String placa);
}
