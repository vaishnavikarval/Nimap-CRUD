package com.NimapTask.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.NimapTask.Entites.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

}
