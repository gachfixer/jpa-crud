package com.crud.crud.repositories;

import com.crud.crud.domain.Users;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UsersRepository extends PagingAndSortingRepository<Users, Long> {
     List<Users> findUsersByUserEmail(String user_email);

     List<Users> findUsersByUserFirstName(@Param("name") String name);

     List<Users> findUsersByUserFirstNameIsLike(@Param("name") String name);
}
