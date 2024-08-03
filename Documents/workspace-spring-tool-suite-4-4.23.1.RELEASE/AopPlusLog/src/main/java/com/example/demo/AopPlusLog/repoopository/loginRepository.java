package com.example.demo.AopPlusLog.repoopository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.AopPlusLog.entity.login_det;

@Repository
public interface loginRepository extends JpaRepository<login_det, Integer> {

}
