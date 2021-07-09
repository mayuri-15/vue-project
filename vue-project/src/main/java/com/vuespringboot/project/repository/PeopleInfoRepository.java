package com.vuespringboot.project.repository;

import com.vuespringboot.project.entity.PeopleInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleInfoRepository extends JpaRepository<PeopleInfo, Long> {

}
