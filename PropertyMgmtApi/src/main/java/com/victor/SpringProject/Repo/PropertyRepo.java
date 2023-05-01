package com.victor.SpringProject.Repo;

import com.victor.SpringProject.Entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@EnableJpaRepositories
@Repository

public interface PropertyRepo extends JpaRepository <Property, Integer> {
}
