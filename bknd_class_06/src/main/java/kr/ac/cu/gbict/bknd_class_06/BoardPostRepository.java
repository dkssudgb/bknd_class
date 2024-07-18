package kr.ac.cu.gbict.bknd_class_06;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardPostRepository extends JpaRepository<BoardPost, Long> {

    public List<BoardPost> findByAuthor(String author);
    public List<BoardPost> findByAuthorAndEmail(String author, String email);
    public List<BoardPost> findByAuthorOrderByCreatedAtDesc(String author);
}
