package com.crudOperation.crudOperation.repo;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crudOperation.crudOperation.entity.Students;

import javax.transaction.Transactional;

@Repository
public interface Repo extends JpaRepository<Students, Integer> {

    @Modifying
    @Transactional
    @Query("UPDATE Students s SET s.stname = :stname WHERE s.stid = :stid")
    void updateName(@Param("stid") int stid, @Param("stname") String stname);

    @Modifying
    @Transactional
    @Query("UPDATE Students s SET s.stname = :stname, s.dob = :dob, s.doa = :doa, s.cid = :cid, s.cfee = :cfee WHERE s.stid = :stid")
    void updateAll(@Param("stid") int stid, @Param("stname") String stname, @Param("dob") Date dob, @Param("doa") Date doa, @Param("cid") int cid, @Param("cfee") int cfee);

    @Modifying
    @Transactional
    @Query("DELETE FROM Students s WHERE s.stid = :stid")
    void deleteByStid(@Param("stid") int stid);

    Optional<Students> findByStid(Integer stid);
}
