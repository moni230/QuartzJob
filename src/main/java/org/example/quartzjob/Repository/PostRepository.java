package org.example.quartzjob.Repository;

import org.example.quartzjob.Entity.PostData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostData, Integer> {


}
