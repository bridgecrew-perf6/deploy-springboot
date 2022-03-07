package awsdeploy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import awsdeploy.Entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
