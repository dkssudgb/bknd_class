package kr.ac.cu.gbict.bknd_class_06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoardPostController {
    
    @Autowired
    private BoardPostService svc;
    
    @PostMapping("/board")
    public BoardPost create(@RequestParam BoardPost entity) {
        return svc.create(entity);
    }
    
    @GetMapping("/board")
    public List<BoardPost> readAll() {
        return svc.readAll();
    }
    
    @GetMapping("board/{postid}")
    public BoardPost read(@PathVariable Long postid) {
        return svc.read(postid);
    }

    @GetMapping("board/byauthor/{author}")
    public String readByAuthor(@PathVariable("author") String author) {
        return svc.readByAuthor(author).toString();
    }
    
    @PutMapping("/board/{postid}")
    public BoardPost update(@PathVariable Long postid, @RequestBody BoardPost post) {
        return svc.update(postid, post);
    }
    
    @DeleteMapping("/board/{postid}")
    public boolean delete(@PathVariable Long postid) {
        return svc.delete(postid);
    }
}
