package hello;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by unicorn on 2016/11/18.
 */
public interface ClueRepository extends ElasticsearchRepository<Clue, String> {
}
