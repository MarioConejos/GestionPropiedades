package admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import admin.model.Comunidad;


public interface ComunidadRepository extends JpaRepository<Comunidad, Long> {

	List<Comunidad> findByCodigoPostal(String codigoPostal);

}
