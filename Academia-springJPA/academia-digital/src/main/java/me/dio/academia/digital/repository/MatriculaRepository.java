package me.dio.academia.digital.repository;

import java.util.Optional;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.Matricula;

public interface MatriculaRepository {

    Optional<Aluno> findById(Long id);

    Matricula save(Matricula matricula);
}
