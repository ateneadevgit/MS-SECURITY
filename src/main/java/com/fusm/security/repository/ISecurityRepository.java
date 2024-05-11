package com.fusm.security.repository;

import com.fusm.security.entity.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISecurityRepository extends JpaRepository<Security, Integer> {

    List<Security> findByIsHtml(Boolean isHtml);
}
