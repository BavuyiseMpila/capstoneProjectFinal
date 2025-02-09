package ac.za.mycput.repository;

import ac.za.mycput.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* AUTHOR NAME Rodrigue Ndzana
This method uses Spring Data JPA's method name query creation feature to generate a query that finds a user by their email address.
The method takes a single argument, which is the email address to search for, and it returns a User object if a match is found, or
null otherwise.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
