package com.webapp.escola_xyz_b.Repository;

import org.springframework.data.repository.CrudRepository;


public interface VerificaCadastroAdmRepository extends CrudRepository<VerificaCadastroAdm, String> {
  VerificaCadastroAdm  findByCpf(String cpf);
}
