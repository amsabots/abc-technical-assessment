package com.github.amsabots.practical.data;

import com.github.amsabots.practical.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<User, Long> {

}
