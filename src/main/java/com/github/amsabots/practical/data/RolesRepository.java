package com.github.amsabots.practical.data;

import com.github.amsabots.practical.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {
}
