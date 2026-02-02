package com.jb.todo_management_system.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jb.todo_management_system.entity.Todo;

// import jakarta.transaction.Transactional;
public interface TodoRepository extends JpaRepository<Todo, Long> 
{


     Optional<Todo> findBySerialNo(Integer serialNo);

    boolean existsBySerialNo(Integer serialNo);

    @Query("SELECT COALESCE(MAX(t.serialNo), 0) FROM Todo t")
    Integer findMaxSerialNo();

    @Modifying
    @Query("UPDATE Todo t SET t.serialNo = t.serialNo - 1 WHERE t.serialNo > :serialNo")
    void shiftSerialNumbersDown(@Param("serialNo") Integer serialNo);

    @Modifying
    void deleteBySerialNo(Integer serialNo);

    List<Todo> findAllByOrderBySerialNoAsc();
    ///////////////////////////////////
    Page<Todo> findAllByOrderBySerialNoAsc(Pageable pageable);


}

