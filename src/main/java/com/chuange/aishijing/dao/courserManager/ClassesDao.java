package com.chuange.aishijing.dao.courserManager;

import com.chuange.aishijing.pojo.classessys.Classes;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;
import java.util.Optional;

@RepositoryDefinition(domainClass = Classes.class, idClass = String.class)
public interface ClassesDao extends JpaRepository<Classes, String> {

    Optional<Classes> findByid(long id) ;

    List<Classes> findAll(Sort var1);

    @Override
    <S extends Classes> S saveAndFlush(S entity);
}
