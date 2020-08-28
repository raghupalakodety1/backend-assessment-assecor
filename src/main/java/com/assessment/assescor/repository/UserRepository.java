package com.assessment.assescor.repository;

import java.util.List;
import java.util.Optional;

import com.assessment.assescor.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	//List<Course> findByCourseDescription(String mCourseDescription);
	//List<User> findAUserList();
    Optional<User> findById(Long Id);
    List<User> findBymColor(String Color);
}

