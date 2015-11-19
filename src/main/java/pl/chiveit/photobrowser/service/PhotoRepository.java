package pl.chiveit.photobrowser.service;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import pl.chiveit.photobrowser.domain.Photo;

@RepositoryRestResource(collectionResourceRel = "photos", path = "photos")
public interface PhotoRepository extends PagingAndSortingRepository<Photo, Long> {

	List<Photo> findByName(String name);
}
