package labs.mongodb.veiculos.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("Veiculos")
public class Veiculos {

	@Id
	public ObjectId _id;

	private String placa;
	private String marca;
	private String modelo;
	private Integer ano;
	private String combustivel;
	private Integer kilometragem;
	public Veiculos() {
	}

	public Veiculos(ObjectId _id, String placa, String marca, String modelo, Integer ano, String combustivel, Integer kilometragem ) {
		this._id = _id;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.combustivel = combustivel;
		this.kilometragem = kilometragem;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public Integer getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(Integer kilometragem) {
		this.kilometragem = kilometragem;
	}

	

}
