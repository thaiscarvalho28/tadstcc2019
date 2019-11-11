
package com.thaistads.sispecort.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.thaistads.sispecort.domain.ManejoSanitario;

@Repository
public interface ManejoSanitarioRepository extends JpaRepository<ManejoSanitario, Integer>{

	@Query("SELECT idManejo FROM ManejoSanitario") List<ManejoSanitario> getAllManejoSanitarios();
	
}
