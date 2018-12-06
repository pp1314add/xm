package com.chuange.aishijing.dao.courserManager;

import com.chuange.aishijing.pojo.classessys.ClassesSale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.Optional;

@RepositoryDefinition(domainClass = ClassesSale.class, idClass = String.class)
public interface ClassesSaleDao extends JpaRepository<ClassesSale,String> {

    Optional<ClassesSale> findByid(long id) ;

    @Override
    <S extends ClassesSale> S saveAndFlush(S entity);
    ClassesSale findByClassesId(long classid );

}
