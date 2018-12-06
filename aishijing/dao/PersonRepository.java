package com.chuange.aishijing.dao;



import com.chuange.aishijing.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Administrator on 2018-10-16.
 */
@RepositoryDefinition(domainClass = Person.class, idClass = Integer.class)
public interface PersonRepository extends JpaRepository<Person,String> {
    List<Person> findAll();

    void deleteById(String name);

    @Query(value = "select p.name from a_person p where p.email=:email", nativeQuery=true)
    String findByEmaill(@Param("email") String email);

    //根据email删除
    @Modifying
    @Transactional
    int deleteByEmail(String email);

    
}
