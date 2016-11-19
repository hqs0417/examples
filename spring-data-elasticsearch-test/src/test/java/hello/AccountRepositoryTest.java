package hello;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.elasticsearch.index.query.MatchAllQueryBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.WildcardQueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import javax.annotation.Resource;

/**
 *
 * Created by unicorn on 2016/11/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AccountRepositoryTest {
    @Resource
    private AccountRepository accountRepository;

    @Test
    public void testFindAll() {
        Iterable<Account> accounts = accountRepository.findAll();
        System.out.println(ToStringBuilder.reflectionToString(accounts, ToStringStyle.DEFAULT_STYLE));
    }

    @Test
    public void testFindByFirstname() {
        List<Account> accounts = accountRepository.findByFirstname("V");
        System.out.println(accounts);
    }

    @Test
    public void testQueryBuilder() {
        QueryBuilder queryBuilder = new MatchQueryBuilder("address", "mill");
        Iterable<Account> accounts = accountRepository.search(queryBuilder);
        System.out.println(accounts);
    }
}
