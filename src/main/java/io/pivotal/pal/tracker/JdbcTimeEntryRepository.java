package io.pivotal.pal.tracker;

import com.mysql.cj.jdbc.MysqlDataSource;

public class JdbcTimeEntryRepository implements TimeEntryRepository {
    public JdbcTimeEntryRepository(MysqlDataSource dataSource) {
    }
}
