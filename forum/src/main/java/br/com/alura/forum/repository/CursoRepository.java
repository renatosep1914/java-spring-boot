package br.com.alura.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	static Curso findByNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
