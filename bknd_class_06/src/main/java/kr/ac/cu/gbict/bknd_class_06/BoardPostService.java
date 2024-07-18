package kr.ac.cu.gbict.bknd_class_06;

import java.util.List;

public interface BoardPostService {

    public BoardPost create(BoardPost post);
    public List<BoardPost> readAll();
    public BoardPost read(Long id);
    public List<BoardPost> readByAuthor(String author);
    public BoardPost update(Long id, BoardPost post);
    public boolean delete(Long id);
}
