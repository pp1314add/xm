package com.chuange.aishijing.dao.upload;

import com.chuange.aishijing.pojo.upload.UploadByte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = UploadByte.class, idClass = String.class)
public interface UploadDao extends JpaRepository<UploadByte,Long> {
}
