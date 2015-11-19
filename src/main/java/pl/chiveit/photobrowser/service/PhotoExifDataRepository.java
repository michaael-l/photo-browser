package pl.chiveit.photobrowser.service;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import pl.chiveit.photobrowser.domain.PhotoExifData;

@RepositoryRestResource(collectionResourceRel = "exifs", path = "exifs")
public interface PhotoExifDataRepository extends PagingAndSortingRepository<PhotoExifData, Long> {

	List<PhotoExifData> findByTitle(String title);
}
