package hello;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by unicorn on 2016/11/18.
 */
public interface UserRepository extends ElasticsearchRepository<User, String> {

}
