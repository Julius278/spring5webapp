package guru.springframework.spring5webapp.repositories;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
