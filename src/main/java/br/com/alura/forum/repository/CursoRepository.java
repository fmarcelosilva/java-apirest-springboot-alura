package br.com.alura.forum.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.model.Curso;
//import br.com.alura.forum.model.Topico;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	//List<Topico> findByCursoNome(String nomeCurso);

	Curso findByNome(String nome);

}
