package com.ganesh.jobportal.repository;

import com.ganesh.jobportal.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}