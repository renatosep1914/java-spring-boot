package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	//relacionamento Curso no curso pegar o nome "_" se tiver um atributo com o mesmo nome	
	List<Topico> findByCursoNome(String nomeCurso);

}
