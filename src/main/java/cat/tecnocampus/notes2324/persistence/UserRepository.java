package cat.tecnocampus.notes2324.persistence;

import cat.tecnocampus.notes2324.application.dtos.UserRatedDTO;
import cat.tecnocampus.notes2324.domain.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
   // TODO 2.3 Uncomment the method and write the query. Note that the query must return a list of UserDTO instead of User

   @Query("SELECT new cat.tecnocampus.notes2324.application.dtos.UserRatedDTO(" +
        "u.id, u.name, u.email, COUNT(n)) " +
        "FROM Note n JOIN n.owner u " +
        "WHERE n.creationDate BETWEEN CURRENT_DATE - 30 AND CURRENT_DATE " +
        "GROUP BY u.id, u.name, u.email " +
        "ORDER BY COUNT(n) DESC")
    List<UserRatedDTO> findUsersRatedByNotes();

}
