package prp;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MensagemRepository extends CrudRepository<Mensagem, Long> {

    List<Mensagem> findByNome(String nome);
}