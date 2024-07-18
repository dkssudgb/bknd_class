package kr.ac.cu.gbict.bknd_class_06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardPostServiceImpl implements BoardPostService {

    @Autowired
    private BoardPostRepository repo;

    @Override
    public BoardPost create(BoardPost post) {
        BoardPost added = repo.save(post);
        return added;
    }

    @Override
    public List<BoardPost> readAll() {
        List<BoardPost> posts = repo.findAll();
        return posts;
    }

    @Override
    public BoardPost read(Long id) {
        BoardPost found = repo.findById(id).orElse(null);
        return found;
    }

    @Override
    public List<BoardPost> readByAuthor(String author) {
        return List.of();
    }

    @Override
    public BoardPost update(Long id, BoardPost post) {
        BoardPost found = repo.findById(id).orElse(null);
        if(found == null) return null;

        found.setSubject(post.getSubject());
        found.setContent(post.getContent());
        repo.save(found);

        return found;
    }

    @Override
    public boolean delete(Long id) {
        BoardPost found = repo.findById(id).orElse(null);
        if(found == null) return false;

        repo.delete(found);
        return true;
    }
}
