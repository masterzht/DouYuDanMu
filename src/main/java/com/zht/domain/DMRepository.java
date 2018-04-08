package com.zht.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DMRepository extends JpaRepository<DanMuInfo,Integer> {

    DanMuInfo findTopByOrderByIdDesc();

}
