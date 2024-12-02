/*
 * You can use the following import statements
 *
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */
package com.example.eventmanagementsystem.repository;

import com.example.eventmanagementsystem.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface SponsorJpaRepository extends JpaRepository<Sponsor, Integer> {

}