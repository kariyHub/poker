package com.pokerman.poker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketRepository extends JpaRepository<BucketList, Long> {
}