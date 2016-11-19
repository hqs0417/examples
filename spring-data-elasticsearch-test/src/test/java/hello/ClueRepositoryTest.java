package hello;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.json.JSONArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.swing.event.ListDataEvent;

/**
 * Created by unicorn on 2016/11/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClueRepositoryTest {

    @Resource
    private ClueRepository clueRepository;


    @Test
    public void test() {
        QueryBuilder queryBuilder = new MatchQueryBuilder("company_name", "百");

        Page<Clue> clues = clueRepository.search(queryBuilder, new PageRequest(0, 10));
        for (Clue clue : clues) {
            System.out.println(ToStringBuilder.reflectionToString(clue));
        }
    }
}
