package com.chuange.aishijing.dao.courserManager;

import com.chuange.aishijing.pojo.classessys.ClassComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;
import java.util.Optional;

@RepositoryDefinition(domainClass = ClassComments.class, idClass = String.class)
public interface ClassesCommentsDao extends JpaRepository<ClassComments, Long> {
    Optional<ClassComments> findByid(Long id) ;

    @Override
    <S extends ClassComments> S saveAndFlush(S entity);

    List<ClassComments> findAllByClassId(long classid);
    List<ClassComments> findAllByClassIdAndCommentUser(long classid,String commentUser);


}
