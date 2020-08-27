package com.assessment.assescor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	//List<Course> findByCourseDescription(String mCourseDescription);
	//List<User> findAUserList();
    Optional<User> findById(Long Id);
    List<User> findBymColor(String Color);
}

