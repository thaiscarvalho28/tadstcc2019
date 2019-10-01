//As classes Repository sao responsaveis por acessar o banco de dados
package com.thaistads.sispecort.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thaistads.sispecort.domain.Fazenda;

@Repository
public interface FazendaRepository extends JpaRepository<Fazenda, Integer>{
/*Um objeto desse tipo sera capaz de realizar operacoes de acesso a dados. 
Pode ser buscar, salvar, alterar ou deletar.
 */
}
