package com.tagir.api.cloneavito.repositories;

import com.tagir.api.cloneavito.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
