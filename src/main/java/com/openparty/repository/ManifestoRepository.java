package com.openparty.repository;

import com.openparty.model.Manifesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManifestoRepository extends JpaRepository<Manifesto, Long> {
}
