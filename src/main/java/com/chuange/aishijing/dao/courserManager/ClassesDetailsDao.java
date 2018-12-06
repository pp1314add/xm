package com.chuange.aishijing.dao.courserManager;

import com.chuange.aishijing.pojo.classessys.ClassesDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;
import java.util.Optional;

@RepositoryDefinition(domainClass = ClassesDetails.class, idClass = String.class)
public interface ClassesDetailsDao extends JpaRepository<ClassesDetails, String> {

    Optional<ClassesDetails> findByid(String id) ;

    @Override
    <S extends ClassesDetails> S saveAndFlush(S entity);


   List<ClassesDetails>  findAllByClassId(String classId);

}
